package SmartEnergyConsumptionMonitor;
import java.text.SimpleDateFormat;
import java.util.*;
public class EnergyAppMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EnergyMonitor monitor = new EnergyMonitor();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {

            System.out.println("How many readings you want to enter?");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {

                System.out.println("\nEnter Date (dd-MM-yyyy): ");
                String dateInput = sc.nextLine();
                Date date = sdf.parse(dateInput);

                System.out.println("Enter energy units: ");
                double units = sc.nextDouble();
                sc.nextLine();

                monitor.addReading(date, units);
            }

            monitor.generateReport();

            System.out.println("\nEnter month number (0-11) for monthly average:");
            int month = sc.nextInt();

            double monthlyAvg = monitor.calculateMonthlyAverage(month);
            System.out.println("Monthly Average: " + monthlyAvg + " units");

        } catch (InvalidEnergyReadingException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}
