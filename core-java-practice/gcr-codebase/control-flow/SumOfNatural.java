// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result


//package controlflow;
import java.util.*;
public class SumOfNatural {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if(number > 0) {
			int sumWhile = 0;
			int i = 1;
			//Use while loop to compute sum
			while(i<=number) {
				sumWhile += i;
				i++;
				
			}
			//Calculates using formula
			int sum = number * (number+1) / 2;
			
			System.out.println("Sum using while loop: " + sumWhile);
			System.out.println("Sum using formula: " + sum);
			
			if(sumWhile == sum) {
				System.out.println("Both results are correct");
				
			}else {
				System.out.println("Both results are not equal");
			}
		}
		
	}

}
