//Create a program to print a multiplication table of a number.
//Hint => 
//Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
//Run a loop from 1 to 10 and store the results in the multiplication table array
//Finally, display the result from the array in the format number * i = ___



//package arrays;
import java.util.*;
public class MultipleTable {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// Get Input number
	
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
	//Define an array to store multiplication results (1 to 10);
	
	int[] table = new int[10];
	
	//Calculate multiplication and store in array
	
	for(int i = 1; i<=10; i++) {
		table[i-1] = number*i;
		
	}
	//Display the multiplication table
	
	System.out.println("\nMultiplication Table of " + number + " :");
	for(int i = 1 ; i<=10 ; i++) {
		System.out.println(number + " * " + i + " = " + table[i-1]);
	}
	sc.close();
	
	}	

}
