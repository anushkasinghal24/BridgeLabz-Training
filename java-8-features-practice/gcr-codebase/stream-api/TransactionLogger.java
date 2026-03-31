/*Logging Transactions
Given a list of transaction IDs, use forEach() to log each transaction to the console with a
timestamp.
transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " -
Transaction: " + id));*/

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> transactionIds = new ArrayList<>();

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter transaction IDs:");
        for (int i = 0; i < n; i++) {
            transactionIds.add(sc.nextLine());
        }

        System.out.println("\nTransaction Logs:");
        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );

        
    }
}
