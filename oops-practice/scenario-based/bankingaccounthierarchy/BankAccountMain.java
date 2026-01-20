package bankingaccounthierarchy;

/* Banking Account Hierarchy
Scenario: 
In a financial management software for a banking institution, various account types must maintain secure and immutable records of customer details while calculating specific fees based on account features. 
Design an abstract class BankAccount with private final fields for accountNumber and balance to ensure immutability of core data. 
Create concrete subclasses SavingsAccount and CheckingAccount. Implement a polymorphic method double calculateFee() that computes transaction fees differently (Savings: 0.5% of balance, Checking: flat 1.0 if balance < 1000). 
Focus on performance by using primitive types and avoiding unnecessary object creations in calculations.  */

import java.util.*;

public class BankAccountMain{

    public static void main(String args[]){

        BankAccount savings=new SavingsAccount("12345", 10000.0);
       

        Scanner sc=new Scanner(System.in);

        System.out.println("Choose acc type:");
        System.out.println("1. Savings");
        System.out.println("2. Checking");
        int type=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter acc no.: ");
        String accno = sc.nextLine();

        System.out.println("Enter balance : ");
        double balance = sc.nextDouble();


        BankAccount account;
        if(type == 1){
            account = new SavingsAccount(accno,balance);
        }
        else if(type == 2){
            account = new CheckingAccount(accno,balance);
        }
        else{
            System.out.println("Invalid account type");
            return;
        }

        System.out.printf("Fee: %.2f%n",account.calculateFee());
        sc.close();
    


    }
}
