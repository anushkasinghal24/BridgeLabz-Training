/*Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.*/
//package strings;

public class CaseToggler {
	public static String toggleCaser(String str) {
		String result = "";
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				result += Character.toLowerCase(ch);
			}else if (Character.isLowerCase(ch)) {
				result += Character.toUpperCase(ch);
			}else {
				result += ch;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Toggle Case: " + toggleCaser("HeLLo"));

	}

}
