/*  Extract Links from a Web Page
🔹 Example Text:
"Visit https://www.google.com and http://example.org for more info."
🔹 Expected Output:
https://www.google.com, http://example.org
*/

import java.util.*;
import java.util.regex.*;

public class ExtractLinks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter link: ");
        String link = sc.nextLine();

        String regex = "https?://[^\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(link);

        boolean found = false;

        while(matcher.find()){
            System.out.print(matcher.group());
            System.out.print(", ");
            found = true;
        }
        if(!found){
            System.out.println("No link found");
        }


    }
}