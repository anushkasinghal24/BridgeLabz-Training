/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/
//Q-4 L-3
//package methods;

import java.util.Arrays;

class NumberCheckerCode {
	//method to count no. of digits
	public static int countDigits(int number) {
		int count = 0 ;
		while( number != 0) {
			count++;
			number /= 10;
			
			
		}
		return count;
	}
	//Method to store digits of number in array
	
	public static int[] storeDigits(int number) {
		int count = countDigits(number);
		int[] digits = new int[count];
		
		for(int i = count - 1 ; i >= 0 ; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		
		return digits;
	}
	
	//method to reverse digit array
	
	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];
		int index = 0;
		
		for(int i = arr.length - 1 ; i >= 0; i--) {
			reversed[index++] = arr[i];
		}
		return reversed;
	}
	
	//Method to compare two arrays 
	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0 ; i<arr1.length ; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
			
			
		}return true;
	}
	
	//Method to check palindrome using digits 
	
	public static boolean isPalindrome(int number) {
		int[] original = storeDigits(number);
		int[] reversed = reverseArray(original);
		return compareArrays(original , reversed);
		
		}
	
	// Method to check duck number using digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);

        for (int digit : digits) {
            if (digit != 0) {
                return true;   // non-zero digit found
            }
        }
        return false;
    }

	

}

public class NumberChecker3{
	public static void main(String[] args) {
		int number = 12021;
		
		//Count digits 
		System.out.println("Number of digits: " + NumberCheckerCode.countDigits(number));
		
		
		//To sotre digits 
		
		int[] digits = NumberCheckerCode.storeDigits(number);
		System.out.println("Digits array: " + Arrays.toString(digits));
		
		//Reverse Digits 
		
		int[] reversed = NumberCheckerCode.reverseArray(digits);
		System.out.println("Reversed Array: " + Arrays.toString(reversed));

		
		//Compare arrays 
		System.out.println("Arrays are equal: " + NumberCheckerCode.compareArrays(digits , reversed));
		
		//Palindrome check 
		
		System.out.println("Is plaindrome : " + NumberCheckerCode.isPalindrome(number));
		
		
		//Duck numbercheck 
		
		System.out.println("Is Duck Number : " + NumberCheckerCode.isDuckNumber(number));
	}
	
}
