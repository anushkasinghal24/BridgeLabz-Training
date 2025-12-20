
//Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
//Hint => 
//Create a String Array to save the results and 
//Finally, loop again to show the results of the array based on the index position

//package arrays;

import java.util.Scanner;

public class FizzBuzzArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Take user Input
		
		System.out.println("Enter Positive integer: ");
		int number = sc.nextInt();
		
		//Check for Positive Integer
		if(number <= 0) {
			System.out.println("Please enetr a positive number");
			return;
		}
		
		//Create string array to store results
		
		String[] results = new String[number + 1];
		
		//Loop from 1 to number and store values
		
		for(int i = 1; i<=number; i++) {
			if(i%3 == 0 && i%5 == 0) {
				results[i] = "FizzBuzz";
				
			}else if(i%3 == 0) {
				results[i] = "Fizz";
				
			}else {
				results[i] = String.valueOf(i);
				
			}
		}
		//Print the result array
		System.out.println("\nFizzBuzz Results: ");
		for(int i = 1; i<= number; i++) {
			System.out.println("Position " + i + " + " + results[i]);
		}sc.close();
	}

}
