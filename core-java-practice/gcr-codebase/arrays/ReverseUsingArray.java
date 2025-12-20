//package arrays;
import java.util.Scanner;
public class ReverseUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		
		int tempNumber = number;
		int digitCount = 0;
		
		//Find the count of Digits 
		
		while(tempNumber != 0) {
			digitCount++;
			tempNumber = tempNumber / 10;
			
		}
		//Array to store digits 
		int[] digits = new int[digitCount];
		tempNumber = number;
		
		//Store digits in array
		for(int i = 0 ; i< digitCount;i++) {
			digits[i] = tempNumber % 10;
			tempNumber = tempNumber / 10;
			
		}
		//array to store reversed digits
		int[] reverseDigits = new int[digitCount];
		
		for(int i = 0 ; i<digitCount; i++) {
			reverseDigits[i] = digits[digitCount -1-i];
			
		}
		//Display reversed number
		
		System.out.println("\nReversed Number: ");
		for(int i = 0; i< digitCount; i++) {
			System.out.print(reverseDigits[i]);
		}
		sc.close();
	}
	

}
