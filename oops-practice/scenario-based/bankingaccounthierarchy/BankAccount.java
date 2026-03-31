package bankingaccounthierarchy;

public abstract class BankAccount{
    private final String accno;
    private final double balance;


    public BankAccount(String accno, double balance){
        this.accno = accno;
        this.balance = balance;
    }

    protected double getBalance(){
        return balance;
    }

    public abstract double calculateFee();
}