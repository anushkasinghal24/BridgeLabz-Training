/*Level 3 Practice Programs
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input for the person's weight (kg) and height (cm) and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person's height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameters. Calls the user-defined method to compute the BMI and the BMI Status and stores in a 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/


//package strings;
import java.util.Scanner;
public class BodyMassIndex {
	
	//Method to calculate BMI and status for one person 
	
	static String[] calculateBMI(double weightInKg, double heightInCm ) {
	double heightInMeter = heightInCm / 100; //Convert cm to m
	double bmi = weightInKg / (heightInMeter * heightInMeter);
	
	
	String status;
	
	if(bmi < 18.5)
		status = "UnderWeight";
	else if (bmi < 25)
		status = "Normal";
	else if(bmi< 30){
		status = "OverWeight";
		
		
	}else {
		status = "obese";
		
	}
	
	return new String[] {
			String.format("%.2f" , heightInCm),
			String.format("%.2f" , weightInKg),
			String.format("%.2f" , bmi),
			status
	};
}	
	
	
	//Method to process height - weight array and return result array
	static String[][] processBMI(double[][] data){
		String[][] result = new String[10][4];
		
		for(int i = 0; i< 10; i++) {
			result[i] = calculateBMI (data[i][0] , data[i][1]);
		}return result;
	}
	
	
	//Method to display result in tabular format 
	
	static void displayResult(String[][] result) {
		System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
		System.out.println("---------------------------------------------------------------");
		
		for(int i = 0; i< result.length; i++) {
			for(int j = 0; j< result[i].length; j++) {
				System.out.println(result[i][j] + "\t\t");
			}
		}
		System.out.println();
	 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//2D array to store weight and height
		
		double[][] data = new double[10][2];
		
		
		//taking user input 
		for(int i =  0; i< 10; i++) {
			System.out.println("\nEnter details of person" + (i+1));
			System.out.print("Weight (kg): ");
			data[i][0] = sc.nextDouble();
			
			System.out.print("Height (cm) : ");
			data[i][1] = sc.nextDouble();
			
		}
		
		String[][] result = processBMI(data);
		displayResult(result);
		
		sc.close();
		

	}

}
