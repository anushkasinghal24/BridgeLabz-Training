//4
/*Write a Java program to remove all duplicate characters from a given string and return
the modified string.*/
//package strings;

public class DuplicateRemover {
	public static String removeDuplicates(String str) {
		String result = "";
		for(char ch : str.toCharArray()) {
			if(result.indexOf(ch) == -1) {
				result += ch;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Remove Duplicates: " + removeDuplicates("programming"));

	}

}
