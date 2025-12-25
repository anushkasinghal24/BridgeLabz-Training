/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) */
//package methods;

import java.util.Scanner;

public class PrintQuotientAndRemainder {
	//Method to find quotient and Remainder
	
	public static int[] findRemainderAndQuotient(int number , int divisor) {
		int quotient = number / divisor ;
		int remainder = number %  divisor;
		return new int[] {quotient , remainder};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the divisor : ");
		int divisor = sc.nextInt();
		
		int[] result = findRemainderAndQuotient(number , divisor);
		
		System.out.println("Quotient + " + result[0]);
		System.out.println("Remainder + " + result[1]);

		sc.close();

	}

}
