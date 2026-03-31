/** Sandeep’s Fitness Challenge Tracker ️‍♂️ Each day Sandeep completes a number of push-ups. 
 * ● Store counts for a week. 
 * ● Use for-each to calculate total and average.
 * ● Use continue to skip rest days.
 * */
//package scenariobased;
import java.util.Scanner;
public class FitnessTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] weeklyPushUps = new int[7];
		
		//Taking input
		System.out.println("Enter push-ups : ");
		
		for(int i = 0 ; i< weeklyPushUps.length ; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			weeklyPushUps[i] = sc.nextInt();
			
			
		}
		int totalPushUps = 0 ;
		int workoutDays = 0;
		
		//For-echloop to calculate total and average
		
		for(int pushUps : weeklyPushUps) {
			if(pushUps == 0) {
				continue;
			}	
			
			totalPushUps += pushUps;
			workoutDays++;
		}	
		
		if(workoutDays > 0) {
			double average = (double) totalPushUps / workoutDays;
			System.out.println("Total pushUps : " + totalPushUps);
			System.out.println("Workout Days : " + workoutDays);
			System.out.println("Average PushUps per day : " + average);
		}else {
			System.out.println("\n No Workout done this week !");
		}
			
	}
		
	
 

}
