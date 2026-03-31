//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
//Hint => 
//Take user input using the  Scanner next() method to take the text into a String variable
//Write a method to return the characters in a string without using the toCharArray() 
//Write a method to compare two string arrays and return a boolean result
//In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result







//package strings;

import java.util.Scanner;

public class CompareUsingCharArray {
	// Method to return characters using charAt()
	static char[] getCharacters(String text) {
		char[] arr = new char[text.length()];
		for(int i = 0; i< text.length(); i++) {
			arr[i] =text.charAt(i);
		}
		return arr;
		
	}
	
	//Method to compare two characterArrays
	
	static boolean compareArrays(char[] a, char[] b) {
		if(a.length != b.length)
			return false;
		for(int i = 0 ; i<a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//User Input 
		System.out.println("Enter a String: ");
		String text = sc.next();
		
		char[] userArray = getCharacters(text);
		
		
		//Built-in Method 
		
		char[] builtInArray = text.toCharArray();
		
		//Compare both arrays 
		
		boolean result = compareArrays(userArray, builtInArray);
		
		
		//Display result
		
		System.out.println("\nCharacters using user method: ");
		for(char c : userArray) {
			System.out.println(c + " ");
			
		}
		System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
		System.out.println("\n\nAre both arrays same? " + result );
		
		sc.close();
		
		
		
		

	}

}
