/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
//package methods;
import java.util.Scanner;
public class CalculateAthleteRounds {
	public static double calculateRounds(double firstSide, double secondSide, double thirdSide) {
		double perimeter = firstSide + secondSide + thirdSide ;
		double totalDistance = 5000;
		return totalDistance / perimeter;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first side of the triangle (in meters): ");
		double firstSide = sc.nextDouble();
		System.out.println("Enter second side of the triangle (in meters): ");
		double secondSide = sc.nextDouble();
		System.out.println("Enter third side of the triangle (in meters): ");
		double thirdSide = sc.nextDouble();
		
		double athleteRounds = calculateRounds(firstSide , secondSide , thirdSide);
		
		System.out.println("The athlete needs to complete " + athleteRounds + " rounds to finish a 5km run. ");
		sc.close();

	}

}
