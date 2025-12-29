/*Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/
//package scenariobased;
import java.util.Scanner;
public class RohanLibraryReminderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variable to store total fine for all books 
		int totalFine = 0;
		for(int i = 1 ; i<= 5 ; i++) {
			System.out.println("Book " + i + " Due Date : ");
			int dueDate = sc.nextInt(); //Input due date
			
			System.out.print("Book " + i + " Return Date: ");
			int returnDate = sc.nextInt(); //Input  return date 
			
			//Check if the book is returned late
			if(returnDate > dueDate) {
				
				//Calculate fine (rupees 5 per late day)
				totalFine += (returnDate - dueDate) * 5;
			}
			
		}
		System.out.println("Total Fine : " + totalFine);
		
		
		
	}

}
