//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//Hint => 
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
//Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
//Finally display the youngest and tallest of the 3 friends

//package arrays;
import java.util.*;
public class YoungestAndTallestUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Amar", " Akbar" , "Anthony"};
		
		//create array to store ages and heights
		
		int[] ages = new int[3];
		double[] heights = new double[3];
		
		//Take input ofr age and height
		
		for(int i = 0 ; i<3; i++) {
			System.out.println("Enter age of " + names[i] + ":");
			ages[i] = sc.nextInt();
			
			System.out.println("Enter height of " + names[i] + "(in cm):");
			heights[i] = sc.nextDouble();
			
			
		}
		//Initialize Youngest and Tallest indices 
		
		int youngestIndex = 0;
		int tallestIndex = 0;
		
		for(int i = 1; i< 3; i++) {
			if(ages[i] < ages[youngestIndex]) {
				youngestIndex = i;
				
			}
			if(heights[i] > heights[tallestIndex]) {
				tallestIndex = i;
				
			}
		}
		//Display results 
		
		System.out.println("\nResults: ");
		System.out.println("Youngest Friend: " + names[youngestIndex] +
				" (Age: " + ages[youngestIndex] + ")");
		System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");
		
		
		sc.close();
		
		

	}

}
