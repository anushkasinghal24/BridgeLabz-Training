//Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
//Hint => 
//Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
//Create an integer array for even and odd numbers with size = number / 2 + 1
//Create index variables for odd and even numbers and initialize them to zero
//Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
//Finally, print the odd and even numbers array using the odd and even index

//package arrays;
import java.util.*;
public class OddEvenArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get user input
		
		System.out.println("Enter a natural number: ");
		int number = sc.nextInt();
		
		//Check for natural number
		
		if(number <= 0) {
			System.out.println("Please enter a valid number");
			return;
		}
		// Create arrays for add and even numbers
		
		int[] evenNumbers = new int[number / 2+1];
		int[] oddNumbers = new int[number / 2+1];
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		for(int i = 1; i<= number; i++) {
			if(i%2 == 0) {
				evenNumbers[evenIndex] = i;
				evenIndex++;
			}else {
				oddNumbers[oddIndex] = i;
				oddIndex++;
				
				
			}
		}
		
		//Print odd Numbers
		System.out.println("\nodd Numbers:" );
		for(int i = 0; i< oddIndex; i++) {
			System.out.println(oddNumbers[i] + " ");
			
		}
		
		//Print even numbers
		System.out.println("\neven Numbers: ");
		for(int i = 0; i<evenIndex; i++) {
			System.out.println(evenNumbers[i] + " ");
		}
		sc.close();

	}

}
