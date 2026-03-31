
/*Extract All Email Addresses from a Text
🔹 Example Text:
"Contact us at support@example.com and info@company.org"
🔹 Expected Output:
support@example.com
info@company.org
 */
import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = sc.nextLine();

        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        while(matcher.find()){
            System.out.println(matcher.group());
        
        }



    
     
    }
}
