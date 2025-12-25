/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
*/
//package methods;


import java.util.*;
public class UnitConvertor {
	//Method to convert kilometers to miles
	public static double convertKmToMiles(double km) {
		return km*0.621371;
	}
	//Method to convert miles to kn
	public static double convertMilesToKm(double miles) {
		return miles*1.60934;
	}
	//Method to convert meters to feet 
	
	public static double convertMetersToFeets(double meter) {
		return meter*3.28084;
	}
	//method to convert feet to meters
	public static double convertFeetToMeter(double feets) {
		return feets*0.3048;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the choice ");
		System.out.println("1. kilometer to miles ");
		System.out.println("2. miles to kilometer ");
		System.out.println("3. meter to feet ");
		System.out.println("4. feet to meter ");
		
		int choice=sc.nextInt();
		
		System.out.println("enter distance");
		int distance=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertKmToMiles(distance)+" miles");
			break;
		case 2:
			System.out.println(convertMilesToKm(distance)+" km");
			break;
		case 3:
			System.out.println(convertMetersToFeets(distance)+" feets");
			break;
		case 4:
			System.out.println(convertFeetToMeter(distance)+" meters");
			break;
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}
