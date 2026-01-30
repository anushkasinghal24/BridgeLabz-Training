/*Validate a License Plate Number
License plate format: Starts with two uppercase letters, followed by four digits.
Example: "AB1234" is valid, but "A12345" is invalid.
 */
import java.util.*;
public class LicensePlateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter License Plate Number : ");
        String num = sc.nextLine();

        if(num.matches("^[A-Z]{2}\\d{4}$")){
            System.out.println("Valid Licence Plate ");
        }else{
            System.out.println("Invalid Licence Plate ");
        }
    }
    
}
