//package arrays;
import java.util.Scanner;
public class FindLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//take user Input
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		//Maximum digits allowed to take
		int maxDigit = 10;
		
		//Array to store digits
		int[] digits = new int[maxDigit];
		
		//Index for array
		
		int index = 0;
		
		//Extract digits and store in array
		while(number != 0 && index < maxDigit) {
			int digit = number%10;
			digits[index] = digit;
			index++;
			
			number = number/10;
			
		}
		// Variables to store largest and second largest digits
		int largest = 0;
		int secondLargest = 0;
		
		//Find largest and secondLargest
		
		for(int i = 0; i< index ; i++) {
			if(digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
				
			}else if(digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
				
			}
					
		}
		//Display result 
		System.out.println("\nLargest digit: " + largest);
		System.out.println("Second largest digit: " + secondLargest);
		sc.close();
		

	}

}
