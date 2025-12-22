/*
 Write a program to check if two texts are anagrams and display the result
Hint => 
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.  
*/



//package strings;
import java.util.Scanner;
public class CheckAnagram {
	
	//Methods to check if two texts are anagrams
	
	static boolean isAnagram(String text1 , String text2) {
		//Check length
		if(text1.length() != text2.length()) {
			return false;
		}
		
		//Frequency array (for LowerCase English letters)
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		
		for(int i = 0; i<text1.length(); i++) {
			char c1 =text1.charAt(i);
			char c2 = text2.charAt(i);
			freq1[c2 - 'a']++;
			freq2[c2 - 'a']++;
			
		
		}
		//Compare frequency arrays
			for(int i = 0; i<26; i++) {
				if(freq1[i] != freq2[i]) {
					return false;
					
				}
				
			}
			return true;
 	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first text: ");
		String text1 = sc.next().toLowerCase();
		
		
		System.out.println("Enter second text: ");
		String text2 = sc.next().toLowerCase();
		
		//Check anagram
		
		boolean result =isAnagram(text1 , text2);
		
		//Display result
		
		if(result) {
			System.out.println("The given texts are anagrams ");
			
		}else {
			System.out.println("The given texts are not anagrams ");
		}
	
		sc.close();

	}

}
