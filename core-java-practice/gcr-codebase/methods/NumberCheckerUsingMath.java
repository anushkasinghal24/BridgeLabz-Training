/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/
//package methods;

import java.util.Arrays;

class NumberChecker {
	public static int countDigits(int number) {
		int count = 0 ;
		while( number != 0) {
			count++;
			number /= 10;
			
		}
		return count;
	}
	
	
	//Method to store digits of the number in an array
	
	public static int[] storeDigits(int number) {
		int count = countDigits(number);
		int[] digits = new int[count];
		
		
		for(int i= count-1 ; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}
	
	
	//Method to find sum of digits using digits array
	
	public static int sumOfDigits(int[] digits) {
		int sum= 0;
		for(int digit : digits) {
			sum += digit;
			
		}
		return sum;
	}
	
	
	//Method to find sum of squares of digits using Math.pow()
	
	public static int sumOFSquaresOfDigits(int[] digits) {
		int sum = 0;
		for(int digit : digits) {
			sum += (int) Math.pow(digit, 2);
			
		}return sum;
	}
	
	
	//Method to check Harshad Number 
	public static boolean isHarshadNumber(int number) {
		int[] digits = storeDigits(number);
		int sum = sumOfDigits(digits);
		
		return number % sum == 0;
		
	}

	//Method to find frequency of each digit using 2D array
	public static int[][] digitFrequency (int[] digits){
		int[][] frequency = new int[10][2];
		
		for(int i = 0; i < 10 ; i++) {
			frequency[i][0] = i;
			frequency[i][1] = 0;
			
		}
		//Count frequency
		for(int digit : digits) {
			frequency[digit][1]++;
		}
		return frequency;
	}
	
}
public class NumberCheckerUsingMath{
	public static void main(String[] args) {
		int number = 21;
		
		int[] digits = NumberChecker.storeDigits(number);
		System.out.println("Digits : " + Arrays.toString(digits));
		
		//Sum of digits 
		
		System.out.println("Sum of Digits : " + NumberChecker.sumOfDigits(digits));
		
		System.out.println("Sum of square of digits: " + NumberChecker.sumOFSquaresOfDigits(digits));
		
		System.out.println("is Harshad Number : " + NumberChecker.isHarshadNumber(number));
		
		int[][] frequency = NumberChecker.digitFrequency(digits);
		System.out.println("Digit Frequency");
		System.out.println("Digit  | Frequency");
		
		for(int i = 0; i< frequency.length; i++) {
			if(frequency[i][1] > 0) {
				System.out.println(" " + frequency[i][0] + "      |          "  + frequency[i][1]);
			}
		}
	}
}
