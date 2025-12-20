//package arrays;
import java.util.Scanner;
public class BMICalculator2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of persons: ");
		int number = sc.nextInt();
		
		// 2D array to store weight, height, BMI
        // Index 0 -> Weight, 1 -> Height, 2 -> BMI
		
		double[][] personData = new double[number][3];
		
		//Array to store weight status
		String[] weightStatus = new String[number];
		
		//take  input from weight and height
		
		for(int i = 0 ; i< number ; i++) {
			System.out.println("\nEnter details for person " + (i+1));
			//input weight 
			while(true) {
				System.out.println("Enter weight (kg):");
				personData[i][0] = sc.nextDouble();
				
				if(personData[i][0] > 0) {
					break;
					
				}
				System.out.println("Invalid weight! Please enter a positive value.");
			}
				//Input height (must be positive)
			
			while(true) {
				System.out.println("Enter height (meters): ");
				personData[i][1] = sc.nextDouble();
				
				if(personData[i][1] > 0) {
					break;
				}
				System.out.println("Invalid height! Please enter a positive value.");
			}
		}
		
		//Calculate BMI and determine weight status 
		
		for(int i = 0; i< number; i++) {
			//BMI = weight / (Height * Height)
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
			
			double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
		}
		
		//Display Results
		
		System.out.println("\n-------BMI report (using 2D array) ---------");
		
		for(int i = 0; i< number ; i++) {
			System.out.println("Person " + (i + 1) +
            " | Weight: " + personData[i][0] + " kg" +
            " | Height: " + personData[i][1] + " m" +
            " | BMI: " + String.format("%.2f", personData[i][2]) +
            " | Status: " + weightStatus[i]);
		}sc.close();
		
		
		

	}

}
