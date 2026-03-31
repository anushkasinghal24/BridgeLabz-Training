//5
/*Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/
package strings;

public class LongestwordFinder {
	public static String longestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longest = words[0];
		
		for(String word : words) {
			if(word.length() > longest.length()) {
				longest = word;
				
			}
			
		}
		return longest;
	}

	public static void main(String[] args) {
		System.out.println("Longest Word: " +
                longestWord("Java makes programming interesting"));

	}

}
