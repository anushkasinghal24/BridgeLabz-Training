/*4. Banking System
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.
 */


import java.util.*;
//Interface for loan functionality
interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();

}

//Abstract BankAccount class
abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;

    //Constructor 
    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

    }
    public String getAccountNumber(){
        return accountNumber;

    }

    public String getHolderName(){
        return holderName;

    }
    public double getBalance(){
        return balance;
    }

    //Deposit Method
    public void deposit (double amount ){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited Successfully");

        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount withdraw successfully");

        }else{
            System.out.println("Insufficient Balance or invalid amount");
        }
    }

    //Abstract method 
    public abstract double calculateInterest();

}

class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName , balance);
    }

    public double calculateInterest(){
        return getBalance() * 0.04;
    }
    public void applyForLoan(){
        System.out.println("Loan Applied under Saving Account");
    }
    public double calculateLoanEligibility(){
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(String accountNumber , String holderName , double balance){
        super(accountNumber, holderName , balance);
    }

     @Override
    public double calculateInterest(){
        return getBalance() * 0.02; // 2% interest
    }

    
    public void applyForLoan(){
        System.out.println("Loan applied under Current Account.");
    }

    
    public double calculateLoanEligibility(){
        return getBalance() * 3;
    }


}


//Main Class 
public class BankingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accountList = new ArrayList();
        System.out.println("Enter no. of accounts: ");
        int totalAccounts = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <= totalAccounts; i++){

            System.out.println("\nAccount " + i);
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.print("Choose account type: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Account Number: ");
            String accNo = sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account = null;

            if (choice == 1){
                account = new SavingsAccount(accNo, name, balance);

            } else if (choice == 2){
                account = new CurrentAccount(accNo, name, balance);
            } else{

                System.out.println("Invalid account type!");
                continue;
            }

            accountList.add(account);
        }

        // Polymorphism demonstration
        System.out.println("\n===== Account  Details :  =====");

        for (BankAccount account : accountList){

            System.out.println("\nAccount Number : " + account.getAccountNumber());
            System.out.println("Holder Name  : " + account.getHolderName());
            System.out.println("Balance : " + account.getBalance());

            double interest = account.calculateInterest();
            System.out.println("Interest       : " + interest);

            if (account instanceof Loanable){
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan();
                System.out.println("Loan Eligibility: " +
                        loanAccount.calculateLoanEligibility());
            }

            System.out.println("-----------------------------");
        }


        
    }
}