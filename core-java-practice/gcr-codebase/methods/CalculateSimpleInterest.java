/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/


//package methods;
import java.util.Scanner;
public class CalculateSimpleInterest {
	
	public static double simpleInterest(int principal , double rate , int time) {
		double simpleInterest = (principal * rate * time)/100;
		return simpleInterest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		int principal = sc.nextInt();
		
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time: ");
		int time = sc.nextInt();
		
		
		//Calling method to calculate Simple Interest
		double callSimpleInterest = simpleInterest(principal , rate , time);
		
		System.out.println("The Simple interest is " + callSimpleInterest + " for principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
		sc.close();
		
		
		
		

	}

}
