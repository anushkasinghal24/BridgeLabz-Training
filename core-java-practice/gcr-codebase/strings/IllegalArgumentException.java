//Write a program to demonstrate IllegalArgumentException
//Hint => 
//Define a variable of type String and take user input to assign a value
//Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
//Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException






//package strings;
import java.util.Scanner;
public class IllegalArgumentException {
	//Generate IllegalException
	static void generateException(String text) {
		System.out.println(text.substring(5,2));
	}
	//Handles IllegalException
	
	static void handleException(String text) {
		
		try {
			//start index > end index
			System.out.println(text.substring(5,2));
			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("IllegalArgumentException caught and handled");
			
		}catch(RuntimeException e) {
			System.out.println("Generic Runtime exception caught");
			
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		
		String text = sc.next();
		
		//Calling method that generates exception
		
		System.out.println("\nCalling generateException() ");
		try {
			generateException (text);
		}catch(RuntimeException e) {
			System.out.println("Exception occurred in generateException()");
			
		}
		
		//Calling methods that handles exception
		
		System.out.println("\nCalling handleException() ");
		handleException(text);
		sc.close();
		
	}

}
