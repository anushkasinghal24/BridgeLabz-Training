//package leetcode;

/*47. Palindromic Substrings
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

 

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".*/


import java.util.*;


public class PalindromeSubstring {
	
	static int count=0;
	
	public static void helper(int i, int j, String s) {
		while(i >= 0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
			count++;
			i--;
			j++;
		}
		
	
	}


public static int countSubstrings(String s) {
	for(int i = 0;i < s.length(); i++) {
		helper(i, i, s);
		helper(i, i+1, s);
	}
	return count;
	
}


public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter : ");
	String s = sc.nextLine();
	 
	int result = countSubstrings(s);
	
	System.out.println("Number of palindromic strings are "+ result);
}
}