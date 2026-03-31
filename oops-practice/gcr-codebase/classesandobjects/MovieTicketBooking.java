//package classesandobjects;

//Class to represent a Movie Ticket
class MovieTicket {
	
 // Attributes
	 String movieName;
	 String seatNumber;
	 double price;
	 boolean isBooked; // Flag to track if ticket is already booked

 // Constructor
 MovieTicket(String movieName, double price) {
	 
     this.movieName = movieName;
     this.price = price;
     this.seatNumber = " ";
     this.isBooked = false; // Initially ticket is not booked
 }

 // Method to book a ticket
 void bookTicket(String seat) {
	 
     if (!isBooked) {
         this.seatNumber = seat;
         this.isBooked = true;
         System.out.println("Ticket booked for movie: " + movieName);
         System.out.println("Seat Number: " + seatNumber);
         System.out.println("Price: $" + price);
     } else {
         System.out.println("House full!!! sorry..... Ticket already booked");
     }
 }

 // Method to display ticket details
 void displayTicketDetails() {
	 
     if (isBooked) {
    	 
         System.out.println("Ticket booked for movie: " + movieName);
         System.out.println("Seat Number: " + seatNumber);
         System.out.println("Price: $" + price);
     } else {
         System.out.println("Ticket have not booked yet....");
     }
     System.out.println();
 }
}

//Main class to test MovieTicket
public class MovieTicketBooking {
	
	 public static void main(String[] args) {
	     // Create a ticket for a movie
	     MovieTicket ticket = new MovieTicket("Dragon", 120.0);
	
	     // Display ticket details before booking
	     ticket.displayTicketDetails();
	
	     // Try booking the ticket
	     ticket.bookTicket("A10");
	
	     // Try booking again to show "House full" message
	     ticket.bookTicket("A11");
	     ticket.bookTicket("A12");
	
	     // Display ticket details after booking
	     ticket.displayTicketDetails();
	 }
}
