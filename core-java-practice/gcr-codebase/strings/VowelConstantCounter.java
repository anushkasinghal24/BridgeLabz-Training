//1
//Write a Java program to count the number of vowels and consonants in a given string.
//package strings;

public class VowelConstantCounter {
	public static void countVowelsAndConstants(String str) {
		int vowels = 0 ,constants = 0;
		str = str.toLowerCase();
		
		for(char ch : str.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' ||
	                    ch == 'o' || ch == 'u') {
	                    vowels++;
	             } else {
	            	 
	                	constants++;
	                }
			}
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Constants : " + constants); 
	}

	public static void main(String[] args) {
		//Calling method
		countVowelsAndConstants("Hello World");

	}

}
