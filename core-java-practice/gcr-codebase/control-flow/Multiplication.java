// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 

package controlflow;
import java.util.*;
public class Multiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		//Use for loop to multiply number from 6 to 9
		for(int i = 6 ; i<=9 ; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}sc.close();
	}
	

}
