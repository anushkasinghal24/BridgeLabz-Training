/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; */
//package methods;

import java.util.Scanner;

public class UnitConvertorMethods {
	//Method to convert Farhenheit to Celcius
	public static double convertFarhenheitToCelcius(double farh) {
		return (farh-32)*5/9;
	}
	//Method to convert celcius to farenheit
	public static double convertCelciusToFarhenheit(double celcius) {
		return (celcius*9/5)+32;
	}
	
	//Method to convert pound to kg 
	public static double convertPoundToKg(double pound) {
		return pound*0.453592;
	}
	//Method to convert kg to pounds 
	public static double convertKgToPounds(double kg) {
		return kg*2.20462;
	}
	//Method to convert gallons to litres 
	public static double convertGallonsToLiters(double gallon) {
		return gallon*3.78541;
	}
	//Method to convert litres to gallons 
	public static double convertLitersToGallon(double liters) {
		return liters*0.264172;
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the choice ");
		System.out.println("1 - farhenheit to celcuis ");
		System.out.println("2 - celcius to farhenheit ");
		System.out.println("3 - pound to kg ");
		System.out.println("4 -  kg to pound ");
		System.out.println("5 - gallons to liters ");
		System.out.println("6 -  liters to gallons ");
		
		int choice=sc.nextInt();
		
		System.out.println("enter unit");
		double unit=sc.nextDouble();
		
		switch(choice) {
		
		case 1:
			System.out.println(convertFarhenheitToCelcius(unit)+" celcius");
			break;
		case 2:
			System.out.println(convertCelciusToFarhenheit(unit)+" farhenheit");
			break;
		case 3:
			System.out.println(convertPoundToKg(unit)+" kg");
			break;
		case 4:
			System.out.println(convertKgToPounds(unit)+" pounds");
			break;
		case 5:
			System.out.println(convertGallonsToLiters(unit)+" liters");
			break;	
		case 6:
			System.out.println(convertLitersToGallon(unit)+" gallon");
			break;	
		default:
			System.out.println("invalid choice");
			break;
		
			
		
		}
		
		
		
	}

}



