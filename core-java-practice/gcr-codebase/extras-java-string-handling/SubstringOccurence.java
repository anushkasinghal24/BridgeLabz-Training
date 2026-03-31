//6
//Write a Java program to count how many times a given substring occurs in a string.
//package strings;

public class SubstringOccurence {
	public static int countSubstring(String str , String sub) {
		int count = 0 ;
		for(int i = 0; i<= str.length() - sub.length(); i++) {
			if(str.substring( i , i+sub.length()).equals(sub)) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Substring count: " + countSubstring("abababababab" , "aba"));

	}

}
