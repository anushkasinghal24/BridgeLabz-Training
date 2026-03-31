package bankingaccounthierarchy;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accno,double balance){
        super(accno, balance);
    }

    @Override 
    public double calculateFee(){
        return getBalance()*0.005;
    }
}