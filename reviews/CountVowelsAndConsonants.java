package review;
import java.util.Scanner;
public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		int countConsonants = 0;
		int countVowels = 0;
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
					countVowels++;
					
					
				}else {
					countConsonants++;
				}
				
			}
			
			
		}
		System.out.println("Number of vowels: " + countVowels);
        System.out.println("Number of consonants: " + countConsonants);
    }
		
	

}
