/*Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
 */

import java.util.*;

public class CreditCardValidator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card number: ");
        String card = sc.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        if(card.matches(regex)){
            if(card.startsWith("4")){
                System.out.println("valid visa card");
            }
            else{
                System.out.println("valid mastercard");
            }
        }
        else{
            System.err.println("Invalid credit card number");
        }


    }
}