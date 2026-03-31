
//Calculate Body Mass Index and determine weight status
import java.util.*;
public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in kg: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter height in cm: ");
		double heightCm = sc.nextDouble();
		
		double heightMeter = heightCm / 100;
		//Calculate BMI using formula
		double bmi = weight/(heightMeter * heightMeter);
		
		String status;
		// Determine the BMi category based on calculates BMI value
		if(bmi <= 18.4) {
			status = "Underweight";
			
		}else if(bmi <= 24.9) {
			status = "Normal";
			
		}else if(bmi<= 39.9) {
			status = "OverWeight";
		}else {
			status = "Obese";
			
		}
		
		System.out.println("\nBMI value: " +bmi);
		System.out.println("Weight Status: " + status);
		
		
		sc.close();

	}
}
