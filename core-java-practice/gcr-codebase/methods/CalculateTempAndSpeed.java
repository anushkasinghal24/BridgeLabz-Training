/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/
//package methods;
import java.util.Scanner;
public class CalculateTempAndSpeed {
	
	//Method to calculate windCHill temperature
	
	public static double calculateWindChill(double temp , double windSpeed) {
		//Wind CHill Formula use -
		double windChill = 35.74 +0.6215 * temp + ( 0.4275 * temp - 35.75) * Math.pow(windSpeed,  0.16);
		return windChill;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature (in Fahrenheit) : ");
		double temp = sc.nextDouble();
		
		System.out.println("Enter wind speed (in mph) : ");
		double windSpeed = sc.nextDouble();
		
		//Calling the method 
		double result = calculateWindChill(temp , windSpeed);
		
		System.out.println("The wind chill temperature is:  " + result);
		
		sc.close();

	}

}
