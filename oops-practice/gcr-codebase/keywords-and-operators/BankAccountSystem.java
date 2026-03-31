import java.util.*;
class BankAccount{
    //static variables shared by all BankAccount objects 

    static String bankName = "BridgeLabz Bank";
    static int totalAccounts = 0;

    final int accountNumber;

    String accountHolderName;

    //Constructor 

    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;

    }


    //Method to display account details

    void displayAcoountDetails(){
        System.out.println("----Account Details-----");
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);

        //Sttaic Method 
        //Display totalNumber of accounts created 
    }
        static void getTotalAccounts(){

            System.out.println("\nTotal Bank Accounts created : " + totalAccounts);


        }

    

    //Main Class 

    public class BankAccountSystem{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of accounts to create : ");
            int numberOfAccounts = sc.nextInt();
            sc.nextLine();

            for(int i = 1 ; i<= numberOfAccounts; i++){
                System.out.println("\nEnter details for Account " + i);
                System.out.println("Enter Acoount Holder Name : ");

                String holderName = sc.nextLine();
                System.out.println("Enter ACoount number  : ");
                int accNumber = sc.nextInt();
                sc.nextLine();

                //Creating Bank Account Object 
                BankAccount account = new BankAccount(holderName , accNumber);

                //InstanceOf 

                if(account instanceof  BankAccount){
                    account.displayAcoountDetails();
                }
            }
            BankAccount.getTotalAccounts();
            sc.close();
        }
    }
    
}