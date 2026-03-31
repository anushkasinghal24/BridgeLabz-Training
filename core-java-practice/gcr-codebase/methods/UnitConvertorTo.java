/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/
//package methods;

import java.util.*;

public class UnitConvertorTo {
	//Method to convert yards to feet
	public static double convertYardsToFeet(double yards) {
		return yards*3;
	}
	//Method to convert feet to yards 
	public static double feetsToYards(double feet) {
		return feet*0.333333;
	}
	//Method to convert feeet to inches 
	public static double convertMetersToInches(double meter) {
		return meter*39.3701;
	}
	//Method to convert inches to meter
	public static double convertInchesToMeter(double inches) {
		return inches*0.0254;
	}
	//Method to convertor inches to cm
	public static double convertInchesToCentimeter(double inches) {
		return inches*2.54;
	}
	
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice ");
		System.out.println("1 - yards to feets ");
		System.out.println("2 - feets to yards ");
		System.out.println("3 - meter to inches ");
		System.out.println("4 - inches to meter ");
		System.out.println("5 - inches to centimeter ");
		
		int choice=sc.nextInt();
		
		System.out.println("Enter distance");
		double distance=sc.nextDouble();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertYardsToFeet(distance)+" feets");
			break;
		case 2:
			System.out.println(feetsToYards(distance)+" yards");
			break;
		case 3:
			System.out.println(convertMetersToInches(distance)+" inches");
			break;
		case 4:
			System.out.println(convertInchesToMeter(distance)+" meters");
			break;
		case 5:
			System.out.println(convertInchesToCentimeter(distance)+" centimeters");
			break;	
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}




