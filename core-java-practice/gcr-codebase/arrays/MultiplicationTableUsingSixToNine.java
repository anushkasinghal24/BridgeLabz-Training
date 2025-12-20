//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
//Hint => 
//Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
//Finally, display the result from the array in the format number * i = ___

//package arrays;
import java.util.*;
public class MultiplicationTableUsingSixToNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		// Array to store results (for 6 to 9 → 4 values)
		int[] multiplicationResult =new int[4];
		// Calculate multiplication table from 6 to 9
		int index = 0;
		for(int i = 6 ; i<= 9; i++) {
			multiplicationResult[index] = number * i;
			index++;
			
		}
		
		index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
		sc.close();
		

	}

}
