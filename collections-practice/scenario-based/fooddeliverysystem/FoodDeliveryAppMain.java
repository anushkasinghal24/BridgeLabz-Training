
/*Food Delivery Order Routing System
Scenario:
 A food delivery company assigns orders to delivery agents based on proximity and availability.
Requirements:
Store orders using Queue<Order>
Store delivery agents using List<Agent>
Assign orders FIFO to the nearest available agent
Use OOP: Order, Agent, DeliveryService
Throw NoAgentAvailableException if no agent is free
Use methods to assign, cancel, and view active deliveries

Concepts: Queue, List, OOP, Exception Handling*/
package fooddeliverysystem;
import java.util.Scanner;

public class FoodDeliveryAppMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DeliveryService service = new DeliveryService();

        // Input Agents
        System.out.print("Enter number of delivery agents: ");
        int agentCount = sc.nextInt();

        for (int i = 0; i < agentCount; i++) {
            System.out.print("Enter Agent ID: ");
            int agentId = sc.nextInt();
            System.out.print("Enter Agent Location: ");
            int location = sc.nextInt();

            service.addAgent(new Agent(agentId, location));
        }

        // Input Orders
        System.out.print("\nEnter number of orders: ");
        int orderCount = sc.nextInt();

        for (int i = 0; i < orderCount; i++) {
            System.out.print("Enter Order ID: ");
            int orderId = sc.nextInt();
            System.out.print("Enter Order Location: ");
            int location = sc.nextInt();

            service.addOrder(new Order(orderId, location));
        }

        // Menu-driven operations
        while (true) {
            System.out.println("\n1. Assign Order");
            System.out.println("2. Cancel Order");
            System.out.println("3. View Active Deliveries");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        service.assignOrders();
                        break;

                    case 2:
                        System.out.print("Enter Order ID to cancel: ");
                        int cancelId = sc.nextInt();
                        service.cancelOrder(cancelId);
                        break;

                    case 3:
                        service.viewActiveDeliveries();
                        break;

                    case 4:
                        System.out.println("Exiting system");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (NoAgentAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
