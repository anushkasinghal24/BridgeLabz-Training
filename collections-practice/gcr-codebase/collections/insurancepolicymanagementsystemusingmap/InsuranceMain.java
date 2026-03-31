package insurancepolicymanagementsystemusingmap;


import java.time.LocalDate;
import java.util.Scanner;

public class InsuranceMain {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        PolicyManager  manager = new PolicyManager();

        while (true) {
            System.out.println("\n--- Insurance Policy Management System ---");
            System.out.println("1. Add Policy");
            System.out.println("2. Get Policy by Number");
            System.out.println("3. Policies Expiring in 30 Days");
            System.out.println("4. Policies by Policy Holder");
            System.out.println("5. Remove Expired Policies");
            System.out.println("6. Display All Policies");
            System.out.println("7. Exit");
            System.out.print("Enter choice : ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Policy Number : ");
                    String number = sc.nextLine();

                    System.out.print("Enter Policy Holder Name : ");
                    String holder = sc.nextLine();

                    System.out.print("Enter Expiry Date (yyyy-mm-dd) : ");
                    LocalDate expiry = LocalDate.parse(sc.nextLine()) ;

                    manager.addPolicy(new Policy(number, holder, expiry));
                    
                    System.out.println("Policy added successfully");
                    break;

                case 2:
                	
                    System.out.print("Enter Policy Number : ") ;
                    Policy policy = manager.getPolicyByNumber(sc.nextLine());
                    System.out.println(policy != null ? policy : "Policy not found.");
                    break;

                case 3:
                    System.out.println("Policies expiring in next 30 days:");
                    manager.getPoliciesExpiringSoon().forEach(System.out::println);
                    break;

                case 4:
                	
                    System.out.print("Enter Policy Holder Name: ");
                    manager.getPoliciesByHolder(sc.nextLine())
                           .forEach(System.out::println);
                    break;

                case 5:
                	
                    manager.removeExpiredPolicies();
                    System.out.println("Expired policies removed");
                    break;

                case 6:
                    manager.displayAllPolicies();
                    break;

                case 7:
                	
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
