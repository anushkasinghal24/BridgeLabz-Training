
/* Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words." */
import java.util.*;
public class CensorBadWords{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String input = sc.nextLine();

        String[] badwords = {"Damn","Stupid"};

        String result = input;

        for(String word:badwords){
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
            }
        System.out.println(result);
    



    }
}