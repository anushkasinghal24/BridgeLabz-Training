package SmartTrafficCollectionSystem;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TrafficFineSystem system = new TrafficFineSystem();

        while (true) {
            System.out.println("\n1. Add Violation");
            System.out.println("2. Calculate Fine");
            System.out.println("3. Monthly Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter vehicle number: ");
                        String vehicle = sc.nextLine();

                        System.out.println("Choose Violation Type:");
                        System.out.println("1. Speed Violation");
                        System.out.println("2. Signal Jump");
                        System.out.println("3. No Helmet");

                        int type = sc.nextInt();
                        Violation v = null;

                        if (type == 1) v = new SpeedViolation();
                        else if (type == 2) v = new SignalJumpViolation();
                        else if (type == 3) v = new NoHelmetViolation();
                        else {
                            System.out.println("Invalid violation type");
                            break;
                        }

                        system.addViolation(vehicle, v);
                        System.out.println("Violation added successfully!");
                        break;

                    case 2:
                        System.out.print("Enter vehicle number: ");
                        String vNo = sc.nextLine();
                        int fine = system.calculateTotalFine(vNo);
                        System.out.println("Total Fine: " + fine);
                        break;

                    case 3:
                        system.generateReportMonthly();
                        break;

                    case 4:
                        System.out.println("Exiting system. Thank you!");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InvalidVehicleException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}