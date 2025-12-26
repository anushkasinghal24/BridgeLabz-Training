/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/
//package methods;

import java.util.*;
public class CalculateBMI{
	//Method to calculate BMI
    public static void bmiCalculation(double[][] data){
        for(int i = 0; i<data.length; i++){
        	
            double weight = data[i][0];
            double height = data[i][1];
            double heightInMeter = height/100;

            data[i][2] = weight/(heightInMeter*heightInMeter);
        }
    }

    //Method to get status
    public static String getStatus(double bmi){
        if(bmi <= 18.4){
            return "UnderWeight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            return "Normal";
        }
        else if(bmi >= 25 && bmi <= 39.9){
            return "OverWeight";
        }
        else{
            return "Obese";
        }
    
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[3][3];

        for(int i = 0; i<data.length ; i++){
            System.out.println("\nEnter details for person "+ (i+1) );
            System.out.println("Weight ");
            data[i][0] = sc.nextDouble();

            System.out.println("Height ");
            data[i][1] = sc.nextDouble();

        }

        bmiCalculation(data);


        System.out.printf("%-10s %-10s %-15s%n", "Weight", "Height", "BMI","Status");
        for(int i = 0; i<10 ;i++){
        	
            double bmi = data[i][2];
            
            System.out.printf("%-10.2f %-10.2f %-15s%n", data[i][0] , data[i][1] , bmi , getStatus(bmi));

            
        }

    }
}