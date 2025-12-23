/*Election Booth Manager ️
Design a polling booth system.
● Take age input.
● Use if to check if eligible (>=18).
● Record vote (1, 2, or 3 for candidates).
● Loop for multiple voters, exit on special code.*/

//package scenariobased;
import java.util.Scanner;
public class ElectionBoothManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vote1 = 0,vote2 = 0, vote3=0;
		while(true) {
			System.out.println("\nEnter age(Enter -1 to exit): ");
			int age = sc.nextInt();
			//Exit the condition
			if(age == -1){
				break;
				
			}
			//Check the eligibility criteria 
			if(age >= 18) {
				System.out.println("You are eligible to vote");
				System.out.println("Press 1 for candidate A");
				System.out.println("Press 2 for candidate B");
				System.out.println("Press 3 for candidate C");
				int vote = sc.nextInt();
				
				//Record votes 
				
				if(vote == 1) {
					vote1++;
					System.out.println("Vote reached for candidate A ");
					
				}else if (vote == 2) {
					vote2++;
					System.out.println("Vote reached for candidate B");
					
				}
				else if (vote == 3) {
					vote3++;
					System.out.println("Vote reached for candidate C");
					
				}else {
					System.out.println("Invalid Vote");
				}
		}else {
			System.out.println("Yor are not eligible for vote");
		}
			
		}
		
		//Display FInal Result
		System.out.println("\n-----------Election Result-----");
		System.out.println("Candidate A votes: "  +vote1);
		System.out.println("Candidate B votes: "  +vote2);
		System.out.println("Candidate AC votes: "  +vote3);
		sc.close();

	}

}
