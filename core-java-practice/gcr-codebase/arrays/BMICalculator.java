

//package arrays;
import java.util.*;
public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of persons: ");
		int n = sc.nextInt();
		
		
		double[] weight = new double[n];
		double[] height = new double[n];
		double[] bmi = new double[n];
		String[] status = new String[n];
		
		for(int i = 0 ; i< n ; i++) {
			System.out.println("\nEnter details of person " + (i+1));
			System.out.println("Enter weight (kg): ");
			weight[i] = sc.nextDouble();
			
			System.out.println("Enter height (meters): ");
			height[i] = sc.nextDouble();
			
		}
		for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            //Determine weight status using BMI table
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } 
            else {
                status[i] = "Obese";
            }
        }
		
		//Display Results
		System.out.println("\n------BMI Report-----");
		for(int i = 0 ; i< n ; i++) {
			System.out.println("Person " + (i + 1) +
                " | Height: " + height[i] + " m" +
                " | Weight: " + weight[i] + " kg" +
                " | BMI: " + String.format("%.2f", bmi[i]) +
                " | Status: " + status[i]);
		}sc.close();
		
		
		

	}

}
