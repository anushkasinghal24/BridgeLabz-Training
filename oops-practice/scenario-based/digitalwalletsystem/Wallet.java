package digitalwalletsystem;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Insufficient Balance");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
