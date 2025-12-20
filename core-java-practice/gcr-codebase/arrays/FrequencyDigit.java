//Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
//Hint => 
//Take the input for a number
//Find the count of digits in the number
//Find the digits in the number and save them in an array
//Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
//Display the frequency of each digit in the number


//package arrays;
import java.util.*;
public class FrequencyDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		
		int temp = number;
		
		//Count of Digits
		
		int count = 0;
		while(temp!=0) {
			count++;
			temp /=10;
			
		}
		//Store digits in an array
		int[] digits = new int[count];
		temp = number;
		
		for(int i = 0; i< count; i++) {
			digits[i] =temp%10;
			temp /=10;
			
		}
		
		//Frequency Array
		
		int[] frequency = new int[10];
		for(int i= 0; i < count; i++) {
			frequency[digits[i]]++;
			
		}
		
		//Display Frequency
		
		System.out.println("\nDigit Frequency: ");
		for(int i = 0; i< 10; i++) {
			if(frequency[i] > 0) {
				System.out.println("Digit " + i + " : " + frequency[i]);
			}
		}sc.close();
		
		

	}

}
