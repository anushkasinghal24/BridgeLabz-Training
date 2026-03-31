
/* Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass. */
import java.util.*;

class BankAccount{
	
	String accountNumber;
	double balance;
	
	BankAccount(String accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	void display() {
	System.out.println("Account number "+ accountNumber);
	System.out.println("Balance "+ balance);
	
	}
	
	
}

class SavingsAccount extends BankAccount{
	double interest;
	SavingsAccount(String accountNumber,double balance,double interest){
		super(accountNumber,balance);
		this.interest = interest;
	}
	void displayType() {
		System.out.println("Account type: savings");
		System.out.println("Interest rate %: " + interest);
	}
}

class CheckingAccount extends BankAccount{
	double withdrawl;
	CheckingAccount(String accountNumber,double balance,double withdrawl){
		super(accountNumber,balance);
		this.withdrawl = withdrawl;
	}
	void displayType() {
		System.out.println("Account type: checking");
		System.out.println("Withdrawl limit: " + withdrawl);
	}
}


class FixedAccount extends BankAccount{
	int tenure;
	FixedAccount(String accountNumber,double balance,int tenure){
		super(accountNumber,balance);
		this.tenure=tenure;
	}
	void displayType() {
		System.out.println("Account type: fixed");
		System.out.println("Tenure: " + tenure);
	}
}





public class BankAccountSystem {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter account type(savings/checking/fixed):");
		String type = sc.nextLine();
		
		System.out.println("Enter account number");
		String accno = sc.nextLine();
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		
		sc.nextLine();
		
		BankAccount bank = null;
		
		switch (type) {
		case "savings":
			System.out.println("Enter interest rate");
			double rate = sc.nextDouble();
			bank=new SavingsAccount(accno,balance,rate);
			break;
		case "checking":
			System.out.println("Enter withdrawl limit");
			double limit = sc.nextDouble();
			bank=new CheckingAccount(accno,balance,limit);
			break;
		case "fixed":
			System.out.println("Enter tenure");
			int months = sc.nextInt();
			bank = new FixedAccount(accno,balance,months);
			break;
			
			default:
				System.out.println("Invaild input");
				return;
			
			
		}
		
		System.out.println("Account details");
		bank.display();
		
		if(bank instanceof SavingsAccount) {
			((SavingsAccount) bank).displayType();
			
		}
		else if(bank instanceof CheckingAccount) {
			((CheckingAccount) bank).displayType();
			
		}
		
		else if  (bank instanceof FixedAccount) {
			((FixedAccount) bank).displayType();
			
		}
		
	}

}