/*Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/
//package scenariobased;
import java.util.Scanner;
public class TicketBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char continueBooking = 0 ;
		System.out.println("Welcome to Movie Ticket Booking App");
		
		do {
			int totalBill = 0;
			//Types of Movie Selection
			
			System.out.println("\nSelect Movie Type: ");
			System.out.println("1. HollyWood Movie");
			System.out.println("2. Bollywood Movie ");
			System.out.println("3. Tollywood Movie");
			System.out.println("Enter Choise (1-3) : ");
			
			int movieType = sc.nextInt();
			
			switch(movieType) {
			case 1: 
				totalBill += 150;
				break;
			case 2 :
				totalBill += 250;
				break;
			case 3 :
				totalBill += 350;
				break;
			default: 
				System.out.println("Invalid Movie type Selected !!!");
				
				continue;
				
			}
			
			System.out.println("Select  seat type (gold / Silver): ");
			String seatType= sc.next();
			if(seatType.equalsIgnoreCase("gold")) {
				totalBill += 120;
			}else if(seatType.equalsIgnoreCase("silver")){
				totalBill += 80;
			}else {
				System.out.println("Invalid Seat Type");
				continue;
			}
			
			//Snacks Option 
			System.out.println("Do you want Snacks ?(Yes / NO) : ");
			String snacks = sc.next();
			if(snacks.equalsIgnoreCase("Yes")) {
				totalBill += 100;
			}
			
			//Display Bill
			
			System.out.println("\nBooking Summary");
			System.out.println("Total amount to pay: " + totalBill);
			
			
			System.out.println("\nBooking tickets for another customer? (y/n): ");
			continueBooking =sc.next().charAt(0);
			
		}while(continueBooking == 'y' || continueBooking == 'y');
		
		System.out.println("\nThank You");
		sc.close();
		

	}

}
