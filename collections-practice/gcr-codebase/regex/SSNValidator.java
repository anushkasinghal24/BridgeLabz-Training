/* Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid */

import java.util.*;

public class SSNValidator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Social Security Number (SSN): ");
        String ssn = sc.nextLine();

        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        if(ssn.matches(regex)){
            System.out.println("Valid SSN");
        }
        else{
            System.err.println("Invalid SSN");
        }
    }
}