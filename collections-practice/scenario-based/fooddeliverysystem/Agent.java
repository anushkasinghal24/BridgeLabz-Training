package fooddeliverysystem;

public class Agent {
	
	private int agentId;
	private int location;
	private boolean available ;
	
	public Agent(int agentId, int location ) {
		this.agentId = agentId ;
		this.location = location;
		this.available = true;
		
		
	}
	
	public int getAgentId() {
		return agentId;
		
	}
	public int getLocation() {
		return location;
	}
	
	public boolean isAvailable() {
		return available;
		
	}
	
	public void assign () {
		available = false;
		
	}
	
	public void free() {
		available  = true;
	}

}
