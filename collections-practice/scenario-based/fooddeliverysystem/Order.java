package fooddeliverysystem;

public class Order {
	private int orderId;
	private int location;
	
	public Order(int orderId, int location) {
		this.orderId = orderId;
		this.location = location;
	}
	public int getOrderId() {
		return orderId;
		
	}
	public int getlocation() {
		return location;
		
	}

}
