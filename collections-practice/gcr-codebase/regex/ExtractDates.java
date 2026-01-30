/*🔹 Example Text:
"The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."
🔹 Expected Output:
12/05/2023, 15/08/2024, 29/02/2020
 */

import java.util.*;
import java.util.regex.*;

public class  ExtractDates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date : ");
        String date = sc.nextLine();

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        boolean found = false;

        while(matcher.find()){
            System.out.print(matcher.group());
            System.out.print(", ");
            found = true;
        }
        if(!found){
            System.out.println("No date found");
        }

    }
}
