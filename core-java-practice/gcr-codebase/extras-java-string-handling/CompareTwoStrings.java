/*Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"

Expected Output:
"apple" comes before "banana" in lexicographical order*/
//package strings;

public class CompareTwoStrings {
	
	public static void compareStrings(String s1 , String s2) {
		int minLength = Math.min(s1.length(), s2.length());
		
		for(int i = 0 ; i< minLength; i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(s1.charAt(i) < s2.charAt(i)) {
					System.out.println(s1 + " comes before " + s2);
					
				}else {
					System.out.println(s2 + " comes before " + s1);
				}return;
			}
		}
		if(s1.length() == s2.length()) {
			System.out.println("Both String =s are equal ");
			
		}else if(s1.length() < s2.length()) {
			System.out.println(s1 + " comes before " + s2);
			
		}else {
			System.out.println(s2 + " comes before " + s1);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareStrings("apple" , "banana");

	}

}
