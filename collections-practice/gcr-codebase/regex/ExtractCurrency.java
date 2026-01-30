/*🔹 Example Text:
"The price is $45.99, and the discount is 10.50."
🔹 Expected Output:
$45.99, 10.50 */

import java.util.*;
import java.util.regex.*;

public class ExtractCurrency{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text : ");
        String text = sc.nextLine();

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}