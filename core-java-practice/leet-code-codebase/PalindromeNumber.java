package leetcode;

/*9. Palindrome Number
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
*/



import java.util.*;


public class PalindromeNumber {
	
	public static boolean isPalindrome(int number) {
		if(number < 0 ||(number % 10 == 0 && number != 0)) {
			return false;
		}
		int halfReverse = 0;
		
		while(number > halfReverse) {
			halfReverse = halfReverse * 10 + number%10;
			number=number/10;
		}
		
		return (number == halfReverse|| number == halfReverse/10);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		
		if(isPalindrome(number)) {
			System.out.println("The number is Palindrome");
		}
		
		else {
			System.out.println("The number is not a Palindrome Number");
		}
	}
}