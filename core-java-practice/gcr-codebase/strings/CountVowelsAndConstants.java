
/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

//5
import java.util.Scanner;

public class CountVowelsAndConstants {

    static String position(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    static int[] calculate(String text) {

        int v = 0 , c = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = position(text.charAt(i));
            if (type.equals("Vowel")) {
                v++;
            } else if (type.equals("Consonant")) {
                c++;
            }
        }
        return new int[]{ v , c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        int[] result = calculate(input);

        System.out.println (" Vowels: " + result[0]);
        System.out.println (" Consonants: " + result[1]);

        sc.close();
    }
}
