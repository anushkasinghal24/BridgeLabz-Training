//10
/*Write a Java program to remove all occurrences of a specific character from a string.*/
//package strings;

public class CharacterRemover {
	public static String removeCharacter(String str , char removeChar) {
		String result = "";
		for(char ch : str.toCharArray()) {
			if(ch != removeChar) {
				result +=  ch;
				
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("remove Character: " + removeCharacter ("Hello World", 'l'));

	}

}
