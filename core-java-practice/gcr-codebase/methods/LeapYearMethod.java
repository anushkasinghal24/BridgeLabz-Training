/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/
//package methods;
import java.util.*;

public class LeapYearMethod {
	
	public static boolean isleapYear (int year) {
		return(year % 400==0)||(year %4==0 && year%100 !=0);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter year");
		
		int year=sc.nextInt();
		
		if(year<1582) {
			System.out.println("Year must be greater than 1582");
			
		}
		else if(isleapYear(year)) {
			
			System.out.println("Leap year");
		}
		else {
			
			System.out.println("Not a leap year");
		}
	}

}
