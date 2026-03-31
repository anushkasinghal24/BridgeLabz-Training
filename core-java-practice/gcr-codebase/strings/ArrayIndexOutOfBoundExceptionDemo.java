//Write a program to demonstrate ArrayIndexOutOfBoundsException
//Hint => 
//Define a variable of array of names and take input from the user
//Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
//Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException



//package strings;
import java.util.Scanner;
public class ArrayIndexOutOfBoundExceptionDemo {
	
	//Generates ArrayIndexOutOfBoundsException
	static void generatesException(String[] names) {
		//Accessing index beyond array length
		
		System.out.println(names[names.length]);
		
	}
	
	//Handles ArrayIndexOutOfBoundsException
	
	static void handlesException(String[] names) {
		try {
			System.out.println(names[names.length]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught and handled");
		}catch(RuntimeException e) {
			System.out.println("Generic RuntimeException caught");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking array size
		System.out.println("Enter number of names; ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		
		//Taking user input
		System.out.println("Enter names: ");
		
		for(int i = 0 ; i<n; i++) {
			names[i] = sc.next();
			
		}
		
		//Calling method that generates exception
		
		System.out.println("\nCalling generateException()...");
		try {
			generatesException(names);
			
		}catch(RuntimeException e) {
			System.out.println("Exception occured in generationException()");
			
		}
		
		//Calling method that handles exception
		System.out.println("\nCalling handleException()...");
		
		handlesException(names);
		
		sc.close();

	}

}
