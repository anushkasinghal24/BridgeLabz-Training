//Write a program to demonstrate NullPointerException. 
//Hint => 
//Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
//Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
//From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException





//package strings;
import java.util.Scanner;
public class NullPointer {
	
	//Generate NullPointerException
	
	static void generateException() {
		String text = null;  //Initialize to null
		System.out.println(text.length());
	}
	static void handleException() {
		String text= null;
		try {
			System.out.println(text.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}

	public static void main(String[] args) {
		
		//Calling method that generate exception
		System.out.println("Calling generateException()");
		try {
			generateException();
			
		}catch(NullPointerException e) {
			System.out.println("Exception occured");
		}
		
		System.out.println("\nCalling handleException()");
		handleException();
		
		

	}

}
