//12
//12. Write a replace method in Java that replaces a given word with another word in a
//sentence:
//package strings;

public class WordReplace {
	public static String replaceWord(String sentence , String oldWord, String newWord) {
		return sentence.replace(oldWord , newWord );
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Replace Word : " + replaceWord("Java is easy" , "easy" , "Powerful"));

	}

}
