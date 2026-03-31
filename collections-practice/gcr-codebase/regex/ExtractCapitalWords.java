/*  Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York
*/
import java.util.*;
import java.util.regex.*;

public class ExtractCapitalWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();

        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}