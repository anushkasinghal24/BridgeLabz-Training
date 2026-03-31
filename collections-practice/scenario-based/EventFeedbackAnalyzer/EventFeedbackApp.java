package EventFeedbackAnalyzer;

import java.util.Scanner;

public class EventFeedbackApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EventFeedbackAnalyzer analyzer = new EventFeedbackAnalyzer();

        System.out.print("Enter number of feedback entries: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {

            try {
                System.out.print("Enter Event ID: ");
                String eventId = scanner.nextLine();

                System.out.print("Enter Rating (1-5): ");
                int rating = scanner.nextInt();
                scanner.nextLine(); 

                analyzer.addRating(eventId, rating);

            } catch (InvalidRatingException e) {
                System.out.println("Error: " + e.getMessage());
                i--; 
            }
        }

        System.out.println("\n--- Event Ratings ---");
        analyzer.displayAllEvents();

        String topEvent = analyzer.getTopRatedEvent();
        System.out.println("\nTop Rated Event: " + topEvent);

       
    }
}