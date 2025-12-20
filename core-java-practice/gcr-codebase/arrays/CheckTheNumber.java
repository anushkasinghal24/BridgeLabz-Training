//Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
//Hint => 
//Define an integer array of 5 elements and get user input to store in the array.
//Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
//If the number is negative, print negative. Else if the number is zero, print zero. 
//Finally compare the first and last element of the array and display if they equal, greater or less

//package arrays;
import java.util.*;
public class CheckTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Define an array of 5 integers
		int[] num = new int[5];
		
		for(int i = 0 ; i< num.length; i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		System.out.println("\n Number Analysis:");
		//Loop through the array and check condition
		for(int i= 0; i< num.length; i++ ) {
			if(num[i] > 0 ) {
				System.out.println(num[i] + " is Positive and ");
				
				//Check even or odd
				if(num[i] % 2 == 0) {
					System.out.println("Even");
				}else {
					System.out.println("Odd");
				}
			}
			else if(num[i] < 0) {
				System.out.println(num[i] + " is Negative");
				
			}
			else {
				System.out.println(num[i] + " is Zero");
			}
		}
		
		int first = num[0];
		int last = num[num.length-1];
		System.out.println("\nComparison of First and Last Elemenst: ");
		
		if(first == last) {
			System.out.println("First and last elements are Equal");
		}else if(first > last){
			System.out.println("First element is Greater than last element");
			
			
		}else {
			System.out.println("First element is lesss than last element");
		}
		sc.close();
	}

}
