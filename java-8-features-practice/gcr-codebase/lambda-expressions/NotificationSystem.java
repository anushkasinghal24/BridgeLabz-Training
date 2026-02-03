
/*Notification Filtering
○ Scenario: A hospital app sends patient alerts. Based on user preference, only
certain alerts should be shown.
○ Task: Use lambdas with Predicate to filter alerts. */
import java.util.*;
import java.util.function.Predicate;

public class NotificationSystem{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Alert> alerts = new ArrayList<Alert>();

        alerts.add(new Alert("Cardiac Arrest! ","EMERGENCY"));
        alerts.add(new Alert("Reminder To Take Medication ","MEDICATION"));
        alerts.add(new Alert("Blood Pressure High  ","EMERGENCY"));
        alerts.add(new Alert("Doctor Appointment Schedule ","APPOINTMENT"));

        while(true){

            System.out.println("Select Alert Type:");
            System.out.println("1. Emergency");
            System.out.println("2. Medication");
            System.out.println("3. Appointment");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice:");
             int choice;

            try {
                choice = Integer.parseInt(sc.nextLine()); // safer than nextInt
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            

            Predicate<Alert> filter=null;
            
            switch(choice){
                case 1:

                filter = alert->alert.type.equalsIgnoreCase("EMERGENCY");
                break;
                case 2:
                filter = alert->alert.type.equalsIgnoreCase("MEDICATION");
                break;  
                case 3:
                filter = alert->alert.type.equalsIgnoreCase("APPOINTMENT");
                break;
                case 4:
                System.exit(0);
                break;  
                default:
                System.out.println("Invalid Choice");
                continue;

                

            }

            System.out.println("Alerts:");
            for(Alert alert:alerts){
                if(filter.test(alert)){
                    System.out.println(" - "+alert.message);
                }
            }
           }

    
    }
}
class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}