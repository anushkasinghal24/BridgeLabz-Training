package com.example.junit_practice.database;

public class DatabaseConnection {

	private boolean connected=false;
	
	public void connect() {
		
		System.out.println("Database connected");
		connected = true;
	}
	
	public void disconnect() {
		System.out.println("Database disconnected");
		connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}
	

}
