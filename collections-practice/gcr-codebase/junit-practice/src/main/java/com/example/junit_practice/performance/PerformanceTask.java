package com.example.junit_practice.performance;

public class PerformanceTask {
	
	public String longRunningTask(){
		try {
			Thread.sleep(3000);
			
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return "Task Completed";
	}

}