
/*Transforming Names for Display
Given a list of customer names, use .map() to convert them to uppercase and
.sorted() to display them alphabetically. */
import java.util.*;

public class TransformingNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print(" Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nCustomer Names (Uppercase & Sorted)");

        names.stream()
                .map(String::toUpperCase)   // transform
                .sorted()                   // sort alphabetically
                .forEach(System.out::println);
    }
}

