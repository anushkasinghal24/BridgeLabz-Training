//Create a program to find the power of a number.

//Get integer input for two variables - number and power and check for positive integer
//Create a result variable with an initial value of 1.
//Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result



package controlflow;
//Calculate the power of a number using for loop
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		
		if(number > 0 && power >= 0) {
			int result = 1;
			//Use for loop to calculate power of the number
			for(int i = 0 ; i< power ; i++) {
				result = result* number; // Multiply result by number in each iteration
			}
			System.out.println(number + " raised to the power " + power + " is " + result);
		}else {
			System.out.println("Please enter a valid positive integer");
		}
		sc.close();
		
		
	
		
		

	}

}
