/** Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).*/
//package scenariobased;
import java.util.Scanner;
public class DigitalWatchSimulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power cut hout (0 - 23) :" );
		int stopHour = sc.nextInt();
		
		System.out.println("Enter power cut minute(0 - 59): ");
		int stopMinute = sc.nextInt();
		//Loop for hours 
		for(int hour = 0; hour < 24 ; hour++) {
			//Loop for minutes (0 too 59)
			for(int minute = 0; minute < 60 ; minute++) {
				if(hour == 13  && minute == 00) {
				System.out.println("Power cut at " + hour + ":" + stopMinute);
				break;
				
				}
				System.out.printf("%02d:%02d\n" , hour , minute);
			
			}
			if(hour == stopHour) {
				break;
		}
		
		
		}
		

	}

}
