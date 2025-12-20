package controlflow;
import java.util.*;
public class LeapYearIf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		if(year >= 1582 && (year % 400 == 0 || (year % 4==0 && year % 100 != 0))) {
			System.out.println("This is not a Leap Year");
			
		}else if (year >= 1582){
			System.out.println("This is not a Leap Year");
					
		}else {
			System.out.println("Leap year calculation is valid only for year >= 1582");
		}
	}

}
