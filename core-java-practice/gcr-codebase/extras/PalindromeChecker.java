/*5. Palindrome Checker:
○ Write a program that checks if a given string is a palindrome (a word, phrase, or
sequence that reads the same backward as forward).
○ Break the program into functions for input, checking the palindrome condition,
and displaying the result.*/
//package extras;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String str = getInput();
        boolean isPalin = isPalindrome(str);
        displayResult(str, isPalin);
    }
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();
        sc.close();
        return input;
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void displayResult(String original, boolean result) {
        if (result) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    
    }
}