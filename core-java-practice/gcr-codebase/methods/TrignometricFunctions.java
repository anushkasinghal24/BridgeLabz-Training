/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
//package methods;
import java.util.Scanner;
public class TrignometricFunctions {
	public static double[] calculateTrignometricFunctions(double angle ) {
		//Convert angle from degrees to radians 
		double radians = Math.toRadians(angle);
		
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);
		//Return result as an array
		return new double[] {sine , cosine , tangent};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angles in degree: ");
		double angle = sc.nextDouble();
		//Calli ng method 
		double[] result = calculateTrignometricFunctions(angle);
		
		System.out.println("Sine of " + angle + " = " + result[0]);
		System.out.println("Cosine of " + angle + " = " + result[0]);
		System.out.println("Tangent of " + angle + " = " + result[0]);
		sc.close();
	}

}
