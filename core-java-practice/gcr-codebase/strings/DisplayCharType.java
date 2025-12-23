/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowerCase if it is an upperCase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/


//6
import java.util.Scanner;

public class DisplayCharType {

    static String identify(char ch) {
    	

        if (ch >= 'A'  && ch  <= 'Z') {
        	
            ch = (char) ( ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch ==  'u') {
                return " Vowel ";
            } else {
                return " Consonant ";
            }
            
        }return "Not a Letter";
        
       
    }

    static String[][] analyzing(String data) {

        String[][] matrix = new String[data.length()][2];

        for (int i = 0; i < data.length(); i++) {
        	
            matrix[i][0] = String.valueOf(data.charAt(i));
            
            matrix[i][1] = identify(data.charAt(i));
        }
        return matrix;
    }

    static void show(String[][] table) {

        System.out.println("Character\tType");

        for (int i = 0; i < table.length ; i++) {
        	
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String value =  sc.nextLine();

        String[][] output = analyzing(value);
        show(output);

        sc.close();
    }
}
