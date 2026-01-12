package digitalwalletsystem;

import java.util.*;

public class Main{

    static Map<Integer, User> users = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do{
            System.out.println("\n====== Digital Wallet System ======");
            System.out.println("1. Create User Wallet");
            System.out.println("2. Add Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4. Wallet to Wallet Transfer");
            System.out.println("5.Bank to Wallet Transfer");
            System.out.println("6. View Transactions");
            System.out.println("7. Exit");
            System.out.print("Enter choice : ");

            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter User ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();

                        users.put(id, new User(id, name));
                        System.out.println(" Wallet Created Successfully");
                        break;

                    case 2:
                        User u1 = getUser();
                        System.out.print(" Enter Amount: ");
                        u1.getWallet().addMoney(sc.nextDouble());
                        System.out.println(" Money Added");
                        break;

                    case 3:
                        User u2 = getUser();
                        System.out.print(" Enter Amount: ");
                        u2.getWallet().withdrawMoney(sc.nextDouble());
                        System.out.println(" Money Withdrawn");
                        break;

                    case 4:
                        System.out.print("Sender ID: ");
                        User from = users.get(sc.nextInt());
                        System.out.print(" Receiver ID: ");
                        User to = users.get(sc.nextInt());
                        System.out.print("Amount: ");
                        new WalletTransfer().transfer(from, to, sc.nextDouble());
                        break;

                    case 5:
                        User receiver = getUser();
                        System.out.print("Amount : ");
                        new BankTransfer().transfer( null, receiver, sc.nextDouble());
                        break;

                    case 6:
                        User u = getUser();
                        System.out.println("Balance : " + u.getWallet().getBalance());
                        u.getWallet().getTransactions().forEach(System.out::println);
                        break;

                    case 7:
                        System.out.println(" Exiting...");
                        break;

                    default:
                        System.out.println(" Invalid Choice");
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 7);
    }

    static User getUser() {
        System.out.print(" Enter User ID : ");
        return users.get(sc.nextInt());
    }
}
