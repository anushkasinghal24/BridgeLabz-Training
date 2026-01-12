package digitalwalletsystem;

public class WalletTransfer implements TransferService {

    @Override
    public void transfer(User from, User to, double amount) throws InsufficientBalanceException {

        from.getWallet().withdrawMoney(amount);
        to.getWallet().addMoney(amount);

        from.getWallet().addTransaction(new Transaction("WALLET TRANSFER SENT", amount));
        to.getWallet().addTransaction(new Transaction("WALLET TRANSFER RECEIVED", amount));

        System.out.println("Wallet to Wallet Transfer Successful");
    }
}
