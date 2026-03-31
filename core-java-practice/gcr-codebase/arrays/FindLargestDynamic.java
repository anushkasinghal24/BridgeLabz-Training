//package arrays;
import java.util.Scanner;
public class FindLargestDynamic {

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
		
		while(number != 0) {
			if(index == maxDigit) {
				maxDigit = maxDigit + 10;
				int[] temp = new int[maxDigit];
				for(int i = 0 ; i< index; i++) {
					temp[i] = digits[i];
					
				}
				
				//Assign temp array back to digits 
				digits = temp;
				
					
			}
			//Store lastDigit
			digits[index] = number % 10;
			index++;
			
			//Remove last digit
			
			number = number / 10;
			
		}
		
		//Variable to store largest and second largest digits
		
		int largest = 0;
		int secondLargest = 0;
		
		//Find largest and secondLargest digit
		
		for(int i = 0; i< index ; i++) {
			if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
			
		}
		//Display results 
		System.out.println("\nLargest digit: " + largest);
		System.out.println("Second largest digit: " + secondLargest);
		sc.close();

	}

}
