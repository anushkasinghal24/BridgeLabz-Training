//Create a program to find the mean height of players present in a football team.
//Hint => 
//The formula to calculate the mean is: mean = sum of all elements / number of elements
//Create a double array named heights of size 11 and get input values from the user.
//Find the sum of all the elements present in the array.
//Divide the sum by 11 to find the mean height and print the mean height of the football team


//package arrays;
import java.util.*;
public class HeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Create an array to store height of players
		double[] height = new double[11];
		double sum = 0.0;
		
		//Take input of height from the user
		for(int i = 0 ; i< height.length; i++) {
			System.out.println("Enter height of player " + (i+1) + ": ");
			height[i] = sc.nextDouble();
			
		}
		for(int i = 0; i<height.length;i++) {
			sum += height[i];
			
		}
		//calculate mean of height
		double mean = sum / height.length;
		
		//Display mean height
		
		System.out.println("\nMean height of football team is " + mean);
		
		sc.close();
		
	}

}
