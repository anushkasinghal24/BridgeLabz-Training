/*2. Event Attendee Welcome Message
○ Scenario: Print a welcome message for all attendees.
○ Task: Use forEach() with a lambda. */
import java.util.*;
public class EventAttendee {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
    List<String> attendees = new ArrayList<>();
    System.out.println("Enter number of attendees : ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Attendes names : ");
    for(int i = 0; i< n ; i++){
        attendees.add(sc.nextLine());

    }
    System.out.println("\nWelcome Messages : ");
    attendees.forEach(name -> System.out.println("Welcome to the event , " + name + "!"));
        
    }
   


    
    
    
}
