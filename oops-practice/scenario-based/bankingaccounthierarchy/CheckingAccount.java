package bankingaccounthierarchy;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accno,double balance){
        super(accno , balance);
    }

    @Override 
    public double calculateFee(){
        return getBalance()<1000?1.0:0.0;
    }
}
