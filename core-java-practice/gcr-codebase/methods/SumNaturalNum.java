/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop*/


//package methods;
import java.util.Scanner;
public class SumNaturalNum {
	//method to find the sum of n natural number using loop
	
	public static int calculateSum(int num ) {
		int sum = 0 ;
		
		//Using for loop form 1 to n
		for(int i = 1; i<= num ; i++) {
			sum = sum + i;
			
		}return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		//Calling method
		int sumOfNatural = calculateSum(number);
		
		//Display result
		System.out.println("The sum of " + number + " Natural number is: " + sumOfNatural);
		sc.close();
	}
	

}
