/*Date Comparison Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate*/
//package extras;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate firstDate = LocalDate.parse(sc.nextLine());

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate secondDate = LocalDate.parse(sc.nextLine());
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        sc.close();
    }
}