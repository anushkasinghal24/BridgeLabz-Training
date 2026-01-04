/*Methods – Bank Account Manager
1. Scenario: A banking app needs to perform operations like deposit, withdraw, and check balance for a user.
● Problem: Design a BankAccount class with:
● Fields/Properties: AccountNumber, Balance.
● Methods: Deposit(double), Withdraw(double), CheckBalance().
● Include logic to prevent overdraft. */
import java.util.Scanner;
class BankAccount {

    private String accountNumber ;
    private double balance ;

    // Constructor
    BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (overdraft protection)
    void withdraw(double amount){
        if (amount <= 0){

            System.out.println("Invalid withdrawal amount.") ;
        } else if (amount > balance){
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else{
            balance = balance - amount;

            System.out.println("Amount withdrawn successfully.") ;
        }
    }

    // Method to check balance
    void checkBalance(){

        System.out.println("Current Balance: ₹" + balance);
    }
}

public class BankAccountManager {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");

        String accountNumber = input.nextLine();

        System.out.print("Enter Initial Balance: ");

        double initialBalance = input.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:

                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the banking app.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
