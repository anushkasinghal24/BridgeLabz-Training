/*
* Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/
package scenariobased;
import java.util.Scanner;
public class BusRoutineDistanceTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalDistance = 0;
		int distancePerStop = 5;
		
		System.out.println("Welcome to Bus route distance tracker");
		
		//Infinite loop until passenger wants to exit 
		
		while(true) {
			totalDistance += distancePerStop;
			System.out.println("Bus reached at next Stop");
			System.out.println("total distance travelled by bus : " + totalDistance + "km");
			
			System.out.println ("Do you want to stop there ? (Yes / NO) ");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("Yes")) {
				System.out.println("Passenger got off the bus.");
				break;
			}
		}
		
		
		
	}

}
