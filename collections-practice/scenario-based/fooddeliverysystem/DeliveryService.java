package fooddeliverysystem;
import java.util.*;
public class DeliveryService {
	
	private Queue<Order> orderQueue = new LinkedList<>();
	private List<Agent> agents = new ArrayList();
	Map<Integer, Integer> activeDeliveries = new HashMap<>();
	
	
	
	//Add Order 
	public void addOrder(Order order) {
		orderQueue.offer(order);
		
		
	}
	
	//Add Agent 
	public void addAgent(Agent agent) {
		agents.add(agent);
		
	}
	
	//Assign order FIFO to nearest available agent 
	
	public void assignOrders() throws NoAgentAvailableException{
		if(orderQueue.isEmpty()) {
			System.out.println("No Orders to assign");
			return;
			
		}
		Order order = orderQueue.poll();
        Agent nearestAgent = null;
        int minDistance = Integer.MAX_VALUE;

        for (Agent agent : agents) {
            if (agent.isAvailable()) {
                int distance = Math.abs(agent.getLocation() - order.getlocation());
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestAgent = agent;
                }
            }
        }
        if(nearestAgent == null) {
        	throw new NoAgentAvailableException("No delivery Agent available for Order " + order.getOrderId());
        }
        nearestAgent.assign();
        activeDeliveries.put(order.getOrderId(), nearestAgent.getAgentId());

        System.out.println("Order " + order.getOrderId()
                + " assigned to Agent " + nearestAgent.getAgentId());
		
	}
	
	//Cancel Order 
	public void cancelOrder(int orderId) {
		if(activeDeliveries.containsKey(orderId)) {
			int agentId = activeDeliveries.remove(orderId);
			agents.stream()
            .filter(a -> a.getAgentId() == agentId)
            .findFirst()
            .ifPresent(Agent::free);

      System.out.println("Order " + orderId + " cancelled");
  } else {
      System.out.println("Order not found.");
  }
			
		}
	// View active deliveries
    public void viewActiveDeliveries() {
        if (activeDeliveries.isEmpty()) {
            System.out.println("No active deliveries");
            return;
        }

        System.out.println("Active Deliveries:");
        activeDeliveries.forEach((orderId, agentId) ->
                System.out.println("Order " + orderId + " -> Agent " + agentId)
        );
    }
	
	
}
