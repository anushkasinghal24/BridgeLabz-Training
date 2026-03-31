package BankingSystem;

import java.util.*;

public class UserInput{

    private BankManager manager=new BankManager();
    private Scanner sc=new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("1. Add account");
            System.out.println("2. Request withdrawal");
            System.out.println("3. Process withdrawal requests");
            System.out.println("4. Display accounts");
            System.out.println("5. Display accounts sorted by balance");
            System.out.println("6. Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter account number");
                    int accountNumber = sc.nextInt();
                    System.out.println("Enter balance");
                    double balance = sc.nextDouble();
                    manager.createAccount(accountNumber,balance);
                    break;
                case 2:
                    System.out.println("Enter account number");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter amount");
                    double amount  =sc.nextDouble();
                    manager.requestWithdrawal(accountNumber,amount);
                    break;
                case 3:
                    manager.processWithdrawalRequests();
                    break;
                case 4:
                    manager.displayAccounts();
                    break;
                case 5:
                    manager.displaySortedByBalance();
                    break;
                case 6:
                    return  ;
                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}