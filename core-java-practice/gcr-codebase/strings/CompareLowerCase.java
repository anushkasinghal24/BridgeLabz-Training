/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result

*/
//package strings;
import java.util.Scanner;
public class CompareLowerCase {
	
	// Method to convert text to lowerCase using charAt() and ASCII logic
	
	static String convertToLower(String text) {
		String result ="";
		
		for(int i = 0; i< text.length(); i++) {
			char ch = text.charAt(i);
			
			//check the character if it is UpperCase
			if(ch>= 'A' && ch<= 'Z') {
				ch = (char) (ch + 32);  //ASCII conversion
				
			}result = result + ch;
		}
		return result;
	}
	// Method to compare two strings using charAt()
	static boolean compareStrings(String s1 , String s2) {
		if(s1.length() != s2.length())
			return false;
		
		
		
		for(int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i))
				return false;
		}return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking input
		
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		
		
		//User-defined LowerCase conversion
		String userLowerCase = convertToLower(text);
		
		//Built-in LowerCase
		String builtInLower = text.toLowerCase();
		
		
		//Compare both results 
		
		boolean result = compareStrings(userLowerCase , builtInLower);
		
		
		//Display Output
		System.out.println("\nupperCase using charAt(): " + userLowerCase);
		System.out.println("Uppercase using toUpperCase(): " + builtInLower);
		System.out.println("Are both results same? " +result);
		sc.close();
	
		

	}

		

	

}
