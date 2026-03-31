//Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
//Hint => 
//Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
//Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
//Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
//Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element

//package arrays;
import java.util.*;
public class TwoDToOneDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Take input for rows and columns
		System.out.println("Enetr numbet of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();
		
		//Create 2D array (Matrix)
		int[][] matrix = new int[rows][columns];
		
		//Take input for 2D array elements
		
		System.out.println("\nEnter elements of the matrix:");
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
		//Create 1D array of size rows * columns
		
		int[] array = new int[rows * columns];
		
		//Index for 1D array
		int index = 0;
		
		
		for(int i=0; i< rows; i++) {
			for(int j = 0; j<columns; j++) {
				array[index] = matrix[i][j];
				index++;
			}
		}
		//Display the 2D array
		
		System.out.println("\n2D Array (Matrix): ");
		for(int i = 0 ; i< rows ; i++) {
			for(int j = 0 ; j< columns; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
			
		}
		
		//Display the 1D array
		
		System.out.println("\n1D Array after copying:");
		for(int i = 0 ; i< array.length; i++) {
			System.out.println(array[i] + " ");
		}
		sc.close();
		
		
		
		
		
	}

}
