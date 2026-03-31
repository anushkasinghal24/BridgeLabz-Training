package digitalwalletsystem;

public class BankTransfer implements TransferService {

    @Override
    public void transfer(User from, User to, double amount) {
        to.getWallet().addMoney(amount);
        to.getWallet().addTransaction(new Transaction("BANK TRANSFER", amount));
        System.out.println(" Bank to Wallet Transfer Successful ");
    }
}
