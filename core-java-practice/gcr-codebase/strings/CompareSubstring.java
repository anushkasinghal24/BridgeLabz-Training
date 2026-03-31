//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint => 
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result


//package strings;
import java.util.Scanner;
import java.util.Scanner.*;
public class CompareSubstring {
	
	static String createSubstring(String text , int start, int end ) {
		String result = "";
		for(int i = start ; i< end ; i++) {
			result = result + text.charAt(i);
		}
		return result;
	}
	//Method to compare substring using chaeAt()
	static boolean compareString(String s1 , String s2) {
		if(s1.length() != s2.length()) 
			return false;
		
		for(int i = 0 ; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String text = sc.next();
		
		System.out.println("Enter Starting Index: ");
		int startIndex = sc.nextInt();
		
		System.out.println("Enter Ending Index: ");
		int endIndex = sc.nextInt();
		
		
		//Substring using chraAt
		String sub1 = createSubstring(text , startIndex, endIndex);
		//Substring using built-in method
		String sub2 = text.substring(startIndex, endIndex);
		//Compare both Strings
		boolean result = compareString(sub1, sub2);
		
		System.out.println("\nSubstring using charAt(): " + sub1);
		System.out.println("Substring using substring(): " + sub2);
		System.out.println("Are both String same? :" + result);

	}
	

	
}
