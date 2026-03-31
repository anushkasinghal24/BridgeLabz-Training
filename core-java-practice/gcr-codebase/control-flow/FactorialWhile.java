// Write a Program to find the factorial of an integer entered by the user.
// Hint => 
// For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
// Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
// Using a while loop, compute the factorial.
// Print the factorial at the end

import java.util.*;
public class FactorialWhile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num>0) {
			int fact = 1;
			int i = 1;
			//Use while loop to compute factorial
			while(i<=num) {
				fact *= i;
				i++;
			}
			System.out.println("Factorial of " + num + " is " + fact);
			
		}else {
			System.out.println("Please enter a natural number");
		}
	}

}
