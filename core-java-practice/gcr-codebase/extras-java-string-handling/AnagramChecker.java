//11
/*11. Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
order).*/
//package strings;

public class AnagramChecker {
	public static boolean areAnagrams(String s1 , String s2) {
		if(s1.length() != s2.length())
			return false;
		
		int freq[] = new int[256];
		
		for(char ch : s1.toCharArray())
			freq[ch]++;
		
		for(char ch : s2.toCharArray())
			freq[ch]--;
		
		for(int i : freq) {
			if( i!= 0)
				return false;
		}return true;
	}

	public static void main(String[] args) {
		 System.out.println("Are Anagrams: " +
	                areAnagrams("listen", "silent"));
		// TODO Auto-generated method stub

	}

}
