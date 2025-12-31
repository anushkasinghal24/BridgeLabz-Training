/*Bank Account Management
Create a BankAccount class with:
accountNumber (public).
accountHolder (protected).
balance (private).
Write methods to:
Access and modify balance using public methods.
Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder. */
import java.util.*;


public class BankAccount {

	
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	
	public BankAccount(int accountNumber,String accountHolder,double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number ");
		int account = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder name ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		SavingsAccount saving=new SavingsAccount(account,name,balance);
		saving.display();
		
		System.out.println("Enter new balance ");
		double newBalance = sc.nextDouble();
		
		saving.setBalance(newBalance);
		System.out.println("updated balance is "+saving.getBalance());
		
		
	}
	
	
}


class SavingsAccount extends BankAccount{
	public SavingsAccount(int accountNumber,String accountHolder,double balance) {
		super(accountNumber,accountHolder,balance);
	}
	
	public void display() {
		System.out.println("account number "+accountNumber);
		System.out.println("account holder name "+accountHolder);
		System.out.println("balance "+getBalance());
	}
}
