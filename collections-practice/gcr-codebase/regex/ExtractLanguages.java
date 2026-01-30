/*🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
 */

import java.util.*;
import java.util.regex.*;

public class ExtractLanguages{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter sentence : ");
        String sentence = sc.nextLine();

        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C|Go|Ruby|PHP)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
