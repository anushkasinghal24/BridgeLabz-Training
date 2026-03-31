//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//Hint => 
//Take user input using the  Scanner next() method for 2 String variables
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String Built-In method to check if the results are the same and display the result 




//package strings;
import java.util.Scanner;
public class CompareStrings {

	static boolean CompareStrings(String a, String b) {
		//Check length
		if(a.length()!= b.length())
			return false;
		for(int i= 0; i<a.length(); i++) {
			if(a.charAt(i) != b.charAt(i))
				return false;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String: ");
		String s1 = sc.next();
		
		System.out.println("Enter second String: ");
		String s2 = sc.next();
		
		boolean result1 = CompareStrings(s1, s2); // charAt() result;
		boolean result2 = s1.equals(s2); //compare using built in equals()
		
		System.out.println("Using charAt(): " + result1);
		System.out.println("Using equals(): " + result2);
		
		if(result1 == result2) {
			System.out.println("Both results are same");
		}else {
			System.out.println("Both results are different");
		}sc.close();
		
		
		
		
		
		

	}

}
