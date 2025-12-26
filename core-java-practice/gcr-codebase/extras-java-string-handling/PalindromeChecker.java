//3
/*Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).*/
//package strings;

public class PalindromeChecker {
	public static String reverseString(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i > 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}

	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome: " + isPalindrome("madam"));
	}

}
