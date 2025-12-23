/*Write a program to to check if a text is palindrome and display the result
Hint => 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check 
Finally, in the main method do palindrome check using the three logic and display result
*/


//Level3 - Q7
import java.util.Scanner;

public class CheckThePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        //Check palindrome using iterative approach
        boolean iterativeResult = isPalindromeIterative(text);
        //Using recursive approach
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        //Using reversing
        boolean reverseResult = isPalindromeReverse(text);
        
        System.out.println("String: " + text);
        System.out.println("Iterative approach: " + iterativeResult);
        System.out.println("Recursive approach: " + recursiveResult);
        System.out.println("Reverse comparison: " + reverseResult);
        
        if (iterativeResult && recursiveResult && reverseResult) {
            System.out.println("All methods are agree: The string is a palindrome!");
        } else {
            System.out.println("All methods are agree: The string is NOT a palindrome!");
        }
    }
    /*
    This method checks whether a string is a palindrome
    using an iterative approach with two pointers.
   */
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        
        int right = text.length() -  1;
        
        while (left < right) {
        	//Compare characters while pointers do not cross
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
           //Move pointers towards the center 
            left++;
            
            right--;
        }
        //If all character matches , it is palindrome
        return true;
    }
    /*
    This method checks whether a string is a palindrome
    using recursion.
    start → beginning index
    end   → ending index
   */
    
    public static boolean  isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        
        return isPalindromeRecursive (text, start + 1, end - 1);
    }
    /*
    This method checks palindrome by reversing the string
    and comparing it with the original string.
   */
    
    public static boolean isPalindromeReverse(String text) {
        String reversed = reverseString(text);
        char[] original = text.toCharArray();
        char[] reversedArray = reversed.toCharArray();
        
        if (original.length  !=  reversedArray.length) {
            return false;
        }
        
        for (int i = 0; i <  original.length;  i++) {
            if (original[i] != reversedArray[i]) {
                return false;
            }
        } return true;
        
    }
    
    public static String reverseString(String text) {
        StringBuilder  reversed = new StringBuilder();
        for (int  i = text.length() - 1; i >= 0; i--) {
            reversed.append (text.charAt(i));
        }
        return reversed.toString();
    }
} 