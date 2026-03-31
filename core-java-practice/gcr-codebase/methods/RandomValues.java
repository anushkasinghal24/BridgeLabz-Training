/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 

*/

//package methods;

import java.util.*;
public class RandomValues{
	//method to generate an array of random 4 digit numbers 
	public static int[] generate4DigitRandomArray(int size) {
		//create an array of given size 
		int[] arr=new int[size];
		for(int i=0;i<size;i++) { //Generate random numbers between 10000 and 9999
			arr[i]=1000+(int)(Math.random()*9000);
		}
		return arr;
	}
	
	//Method to find average , minimum , and maximum of array elements 
	public static double[] findAverageMinMax(int[] numbers) {
		int sum=0;
		//Initialize min and max with first element 
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i:numbers) {
			sum = sum+i;
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		//Calculate average 
		double avg = sum/(double) numbers.length;
		return new double[] {avg,min,max};
	}
	
	public static void main(String[] args) {
		//generate array of 5 random digits 
		int[] nums = generate4DigitRandomArray(5);
		
		System.out.println("Random numbers");
		
		for(int i:nums) {
			System.out.print(i+" ");
			
		}
		
		double[] result=findAverageMinMax(nums);
		//Find average , minimum and maximum
		System.out.println("\nAverage =  " + result[0]);
		System.out.println("Minimum is " + (int)result[1]);
		System.out.println("Maximum is " + (int)result[2]);
		
	}

	
	

	

}
