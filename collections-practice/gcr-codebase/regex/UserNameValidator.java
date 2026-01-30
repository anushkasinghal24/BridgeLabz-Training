/* Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)
 */
import java.util.*;
public class UserNameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Username : ");
        String username = sc.nextLine();
        if(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")){
            System.out.println("Valid Username !!!");
        }else{
            System.out.println("Invalid Username !!!");
        }

    }
    
}
