//// Creating class with name MultipleBelowUsingwhile indicating the purpose is to
// find all multiples of a given number below 100 using while loop
package controlflow;
import java.util.Scanner;

public class MultipleBelowUsingwhile {

	public static void main(String[] args) {
		//Create a scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		// Check if the number is a positive integer and less than 100
		if(number > 0 && number < 100) {
			//Display
			System.out.println("Multiple of " + number + " below 100 are :");
			//Initialize counter variable starting from 100
			int counter = 100;
			//Using while loop to check multiples till counter is greater than 1
			while(counter > 1) {
				if(counter % number == 0) {
					System.out.println(counter);
					//Decrement the counter
				}counter--;
				
			}
		}else {
			//Display message if input is invalid
			System.out.println("Please enter a positive integer less than 100");
		}sc.close(); //Close the scanner object
		

	}

}
