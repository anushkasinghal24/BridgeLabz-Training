/*Write a Java program to find the most frequent character in a string.*/
//package strings;

public class MostFrequentCharacter {
	public static char mostFrequentChar(String str) {
		int[] freq = new int[256];
		
		for(char ch  : str.toCharArray()) {
			freq[ch]++;
			
		}
		char maxChar =  str.charAt(0);
		for(char ch : str.toCharArray()){
			if(freq[ch] > freq[maxChar]){
				maxChar = ch;
			}
			
		}
		return maxChar;
		
	}

	public static void main(String[] args) {
		System.out.println("Most Frequent Character: " +
                mostFrequentChar("success"));
		

	}

}
