//package classesandobjects;

import java.util.*;
public class ATMSimulator {
	
	String accountHolder;
	String accountNumber;
	double balance;
	
	//constructor
	public ATMSimulator(String accountHolder,String accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public static void displayBank() {
		
		System.out.println("\t\t\t\tState of India\t\t\t\t");
		
	}

	public void deposit(double amount) {
		
		if(amount > 0) {
			
			balance += amount;
			System.out.println("Deposited: "+amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}


	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdrawn amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}


   public void displayBalance() {
	   
       System.out.println("Current balance: " + balance);
       
   }

   public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("******Fill Your Details******");
       
       System.out.print("Enter Your name: \n");
       String name=sc.next();
       
       System.out.print("Enter your Account number : \n");
       String accountNumber=sc.next();
       
       System.out.print("Enter balance: \n");
       double balance=sc.nextDouble();
	   ATMSimulator account = new ATMSimulator(name,accountNumber,balance);
      
       System.out.println("******Welcome to State Bank Of India******");
       boolean start=true;
       while(start) {
    	   System.out.println("1. Display Bank Name \n2. Display Balance \n3. Make Deposit \n4.Withdraw \n5.Exit \n");
    	   int options=sc.nextInt();
    	   switch(options) {
    	   case 1:
    		   displayBank();
    		   break;
    	   case 2:
    		   account.displayBalance();
    		   break;
    	   case 3:
    		   System.out.print("Enter amount to deposit: \n");
    		   account.deposit(sc.nextDouble());
    		   account.displayBalance();
    		   break;
    	   case 4:
    		   System.out.print("Enter amount to deposit: \n");
    		   account.withdraw(sc.nextDouble());
    		   account.displayBalance();
    		   break;
    	   case 5:
    		   System.out.print("Thankyou For Visiting Us");
    		   start=false;
    		   break;
    		   
    	   default:
    		   System.out.print("Invalid Operation please make valid Choice\n");
    		   break; 		   
    		   
    		      		   
    	   }
    	   
       }






   }
}