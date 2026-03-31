/*Email Notifications
Given a list of user emails, use forEach() to send a notification email to each user.
emails.forEach(email -> sendEmailNotification(email));*/
import java.util.*;

public class EmailNotificationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> emails = new ArrayList<>();

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter email addresses:");
        for (int i = 0; i < n; i++) {
            emails.add(sc.nextLine());
        }

        // Sending notifications using forEach()
        emails.forEach(email -> sendEmailNotification(email));

        
    }

    
    public static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
