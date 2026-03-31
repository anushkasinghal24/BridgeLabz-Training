package BankingSystem;

public class WithdrawlRequest{

    private int accountNumber;
    private double amount;

    public WithdrawlRequest(int accountNumber, double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAmount(){
        return amount;
    }


}
