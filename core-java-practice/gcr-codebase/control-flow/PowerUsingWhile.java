//package controlflow;
// Creating Class with name PowerUsingwhile indicationg the purpose is to 
// caluculation the power raised with positive number
import java.util.Scanner;
//Create a Scanner object
public class PowerUsingWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		//Taking another input from the user to entering the power 
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		
		if(number > 0 && power >= 0) {
			int result = 1;
			int counter = 0 ;
			//Using while loop
			while(counter < power) {
				result = result * number;
				counter ++;
				//Print output
			}System.out.println(number + " raised to the power " + power + " is " + result);
		}
		else {
			System.out.println("Please enter a valid positive integer");
		}
		sc.close(); // Closing the Scanner Stream
		
	}
}
