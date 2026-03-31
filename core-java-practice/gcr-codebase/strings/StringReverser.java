//2
/*Write a Java program to reverse a given string without using any built-in reverse
functions.*/
//package strings;

public class StringReverser {
	public static String reverseString(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i > 0; i--) {
			reverse += str.charAt(i);
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
