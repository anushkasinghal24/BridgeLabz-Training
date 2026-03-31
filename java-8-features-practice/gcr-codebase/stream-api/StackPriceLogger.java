/*forEach() Method
1. Stock Price Logger
○ Scenario: Display all stock prices from a live feed.
○ Task: Use forEach() to print updates. */
import java.util.*;
public class StackPriceLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> stockPrices = new ArrayList<>();
        System.out.println("Enter number of stock prices : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter stock price " + (i + 1) + ": ");
            stockPrices.add(sc.nextDouble());
        }
        System.out.println("\nLive Stock Price Updates:");
         stockPrices.forEach(price ->
                System.out.println("Stock Price: " + price)
        );

    }

    
}
