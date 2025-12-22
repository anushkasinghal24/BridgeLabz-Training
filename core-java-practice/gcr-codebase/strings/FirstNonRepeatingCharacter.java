/*Write a program to find the first non-repeating character in a string and show the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result
*/



//package strings;

import java.util.Scanner;


public class FirstNonRepeatingCharacter {
	
	//Method to find first non-repeating character
	static char findFirstNonRepeatingCharacter(String text) {
		int[] frequency = new int[256]; //ASCII character frequency
		
		//Count frequency of each character
		for(int i = 0; i< text.length(); i++) {
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		
		//Find first character with frequency 1
		
		for(int i = 0 ; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(frequency[ch] ==1) {
				return ch;
			}
		}
		return '\0'; //No non repeating character found
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking user input 
		
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		
		char result = findFirstNonRepeatingCharacter(text);
		
		//Display  the result 
		
		if(result != '\0') {
			System.out.println("First non-repeating character is : " + result );
			
		}else {
			System.out.println("No non-repeating ");
		}
		sc.close();
		

	}

}
