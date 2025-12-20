//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//Hint => 
//Take user input for the age and height of the 3 friends and store it in a variable
//Find the smallest of the 3 ages to find the youngest friend and display it
//Find the largest of the 3 heights to find the tallest friend and display it



package controlflow;
import java.util.*;
public class YoungestAndTallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Amar's age: ");
		int amarAge = sc.nextInt();
		System.out.println("Enter Akbar's age: ");
		int akbarAge = sc.nextInt();
		System.out.println("Enter Anthony's age: ");
		int anthonyAge = sc.nextInt();
		
		System.out.println("Enter Amar's height (in cm): ");
		double amarHeight = sc.nextDouble();
		System.out.println("Enter Akbar's height (in cm): ");
		double akbarHeight = sc.nextDouble();
		System.out.println("Enter Anthony's height (in cm): ");
		double anthonyHeight = sc.nextDouble();
		
		
		if(amarAge <= akbarAge && amarAge <= anthonyAge) {
			System.out.println("Youngest Friend: Amar");
			
		}else if( akbarAge <= amarAge && akbarAge <= anthonyAge) {
			System.out.println("Youngest Friend: Akbar");
			
		}else {
			System.out.println("Youngest Friend: Anthony");
		}
		
		if(amarHeight >=akbarHeight && amarHeight >= anthonyHeight) {
			System.out.println("Tallest Friend: Amar");
			
		}else if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight ) {
			System.out.println("Tallest Friend: Akbar");
		}else {
			System.out.println("Tallest rFriend: Anthony");
		}
		sc.close();
	}

}
