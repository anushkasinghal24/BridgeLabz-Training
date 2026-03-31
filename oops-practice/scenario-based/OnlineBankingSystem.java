/*Online Banking System : Key Features (CRUD)
Real Scenario
Users perform transactions, check balance, and transfer money concurrently.Key Features
Account creation
Balance check
Fund transfer
Transaction history
Concepts Used
OOP: Account, SavingsAccount, CurrentAccount
Inheritance: Account → SavingsAccount
Abstraction: BankService interface
Polymorphism: Different interest calculations
Exception Handling: InsufficientBalanceException
Multithreading: Concurrent transactions (synchronized) */
import java.util.*;
//Excpetion handling 
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}


//Abstraction 

interface BankService{
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double calculateInterest();


}




//Base class

abstract class Account implements BankService{

    int accountNumber;
    String holderName;
    double balance;
    List<String > transactions = new ArrayList<>();



    Account(int accountNumber, String holderName,double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;


        transactions.add("Account opened with Rs. " + balance);



    }



    public synchronized void deposit(double amount){

        balance = balance+amount;
        transactions.add("Deposited: Rs. "+amount);
    }



    public synchronized void withdraw(double amount)
        throws InsufficientBalanceException{
            if(amount > balance){
                throw new InsufficientBalanceException("Insufficient balance");

            }
            balance = balance-amount;
            transactions.add("Withdrawn: Rs. " + amount);
        }


        void showBalance(){
            System.out.println("Balance: Rs. " + balance);
        }



        void showTransactions(){
            for(String s:transactions){
                System.out.println(s);
            }
        }

}
    
//Saving Account


        class SavingsAccount extends Account{

            SavingsAccount(int accountNumber, String holderName, double balance){
                super(accountNumber, holderName, balance);
            }

            public double calculateInterest(){
                return balance*0.04;
            }
        }



        //Current Account

        class CurrentAccount extends Account{

            CurrentAccount(int accountNumber, String holderName, double balance){
                super(accountNumber, holderName, balance);
            }
            public double calculateInterest(){
                return balance*0.01;
            }
        }



        //Multithreading


        class TransferThread extends Thread{

            Account from, to;
            double amount;


            TransferThread(Account from, Account to, double amount){
                this.from = from;
                this.to = to;
                this.amount = amount;
            }

            public void run(){
                synchronized(Account.class){
                    try{
                        from.withdraw(amount);
                        to.deposit(amount);
                        System.out.println("Rs. " + amount + "Transferred successfully");
                    }
                    catch (InsufficientBalanceException e){
                        System.out.println(e.getMessage());


                    }
                }
            }
        }
//Main class


public class OnlineBankingSystem{
    public static Scanner sc=new Scanner(System.in);
    static List<Account> accounts = new ArrayList<>();


    static Account findAccount(int accNo){
        for(Account a:accounts)
            if(a.accountNumber == accNo)
                return a;
        
        return null;    
        }


    public static void createAccount(){
        System.out.print("Account no.: ");
        int accNo = sc.nextInt();
        sc.nextLine();


        System.out.print("Holder name : ");
        String name = sc.nextLine();

        System.out.print("Initial balance : ");
        double bal = sc.nextDouble();

        System.out.print("1. Savings account  2. Current account");
        int type = sc.nextInt();


        Account acc = (type == 1)? new SavingsAccount(accNo,name,bal): new CurrentAccount(accNo,name,bal);



        accounts.add(acc);
        System.out.println("Account created");
    }


    //read

    public static void viewAllAccounts(){
        System.out.println("----All accounts----");
         for(Account a: accounts)
            System.out.println(a.accountNumber+"      " + a.holderName + "      Rs. " + a.balance);
    }



    public static void checkBalance(){

        System.out.print("Account number :");
        int acc = sc.nextInt();

        Account a = findAccount(acc);

        if(a != null) a.showBalance();

        else System.out.println("Account not found");
    }


    //update

    static void depositMoney(){
        System.out.print("Account number: ");
        int acc = sc.nextInt();
        System.out.print("Amount: ");
        double amt = sc.nextDouble();


        Account a = findAccount(acc);

        if(a != null){
            a.deposit(amt);
            System.out.println("Deposit successfull");
        }

        else{
            System.out.println("Account not found");
        }
    }


    public static void withdrawMoney(){

        System.out.print("Account number: ");
        int acc = sc.nextInt();
        System.out.print("Amount: ");
        double amt = sc.nextDouble();


        Account a = findAccount(acc);


        try{
            if(a != null){
                a.withdraw(amt);
                System.out.println("Withdrawn successfully");
            }
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }




    //delete

    public static void deleteAccount(){

        System.out.print("Account number to delete : ");
        int acc = sc.nextInt();
        accounts.removeIf(a->a.accountNumber==acc);
        System.out.println("Account deleted");
    }



    //tranfer

    static void transferMoney(){
        System.out.print("From account : ");
        int from = sc.nextInt();
         System.out.print("To account : ");
        int to = sc.nextInt();

         System.out.print("Amount : ");
        int amt = sc.nextInt();


        Account a1 = findAccount(from);
        Account a2 = findAccount(to);



        if(a1 != null && a2 !=null)
            new TransferThread(a1, a2, amt).start();
        else
            System.out.println("Account not found");
    


      }  //Menu


        public static void main(String args[]){

            int ch;
            do{
                System.out.println("----Online banking system----");
                System.out.println("1. Create account");
                System.out.println("2. View all account");
                System.out.println("3. Check balance");
                System.out.println("4. Deposit ");
                System.out.println("5. Withdraw");
                System.out.println("6. Transfer money");
                System.out.println("7. Transaction history");
                System.out.println("8. Delete account");
                System.out.println("9. Calculate interest");
                System.out.println("0. Exit");
                System.out.println("Enter your choice : ");
                ch=sc.nextInt();

                switch(ch){
                    case 1->createAccount();
                    case 2->viewAllAccounts();
                    case 3->checkBalance();
                    case 4->depositMoney();
                    case 5->withdrawMoney();
                    case 6->transferMoney();

                    case 7->{
                        System.out.println("Account number: ");
                        int acc = sc.nextInt();
                        Account a = findAccount(acc);
                        if(a!=null) a.showTransactions();
                    }

                    case 8->deleteAccount();

                    case 9->{
                        System.out.print("Account number: ");
                        int acc = sc.nextInt();
                        Account a = findAccount(acc);
                        if(a!=null){
                            System.out.println("Interest: Rs. " + a.calculateInterest());
                        }
                    }

                    case 0->System.out.println("Thank you");
                    default->System.out.println("Invalid choice");
                }
            }

                while(ch !=0);

            }
        }