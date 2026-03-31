/*
Find unique characters in a string using the charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

//package strings;

import java.util.Scanner;

public class UniqueCharactersUsingCharAt {
	//Find length without using length
	static int findLength(String text){
		int count = 0 ;
		
		
		
		try {
			while(true) {
				text.charAt(count);
				count++;
			}
		} catch(Exception e ){
			//Exception occurs when index goes out of range 
			
			
		}
		 
		return count;
	}
	
	//Find unique characters using charAt()
	static char[] findUniqueCharacters(String text) {
		int len = findLength(text);
		char[] temp = new char[len];
		int uniqueCount = 0;
		
		//Outer loop to select each character 
		
		for(int i = 0; i< len; i++) {
			char current = text.charAt(i);
			boolean isUnique = true;
			
			//Inner loop to select previous characters 
			
			for(int j = 0; j< i ; j++) {
				if(current == text.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			//Store unique character 
			if(isUnique) {
				temp[uniqueCount] =current;
				uniqueCount++;
			}
			
					
		}
		//Create new array to exact size
		char[] result = new char[uniqueCount];
		for(int i = 0 ; i < uniqueCount; i++) {
			result[i] = temp[i];
		}
		return result;
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//user input
		
		System.out.print("Enter the text: ");
		String text = sc.nextLine();
		
		
		//Find unique characters 
		
		char[] uniqueChars = findUniqueCharacters(text);
		
		System.out.println("Unique characters are: ");
		for(char ch : uniqueChars) {
			System.out.print(ch + " ");
		}
		sc.close();

	}

}
