//package scenariobased;

import java.util.*;


public class EmployeeWageCalculation {
	
	static final int hourlyWage = 20;
	static final int fullTimeHours = 8;
	static final int partTimeHours = 4;
	static final int totalWorkingDays = 20;
	static final int maxMonthlyHours = 100;
	
	
	//Use case - 1 : Check whether the employee is present or absent 
	
	public static boolean checkAttendance() {
		
		System.out.println("Use Case-1: EMPLOYEE ATTENDANCE CHECK");
		int attendance = (int)(Math.random()*2); //Randomly generate 0 or 1 
		
		if(attendance == 1) {
			System.out.println("The employee is present");
			return true;
			
		}
		else {
			System.out.println("The employee is absent");
			return false;
			
		}
		
		//return attendance;
		
	}
	
	 // Use Case 2: Calculate daily wage for a full-time employee
	//Assume full time Hour is 8 and wage per hour is 20
	
	public static int calculateDailyWage() {
		System.out.println("Use Case-2: calculating daily wage (Full time)");
		int dailyWage = hourlyWage * fullTimeHours;
		System.out.println("Wage per hour "+ hourlyWage);
		System.out.println("the daily wage is "+ dailyWage);
		
		return dailyWage;
		
	}
	//use case 3Calculate wage for a part-time employee
	//Assume Part time Hour is 4
	
	public static int calculatingPartTimeWage() {
		System.out.println("Use Case-3: Part time employee wage");
		int partTimeWage = hourlyWage * partTimeHours ;
		System.out.println("Part time wage is "+ partTimeWage);
		return partTimeWage;
		}
	
	
	//Use case 4 Calculate employee wage using switch case 
	
	public static int calculateWageByType(Scanner sc) {
		System.out.println("Use Case-4: Wage calculation using switch case implementation");
		
		System.out.println("Enter the employee(1-full and 2-part)");
		int employeeType = sc.nextInt();
		int wage = 0;
		switch(employeeType) {
		case 1:
			System.out.println("The employee type is full time");
			wage = hourlyWage * fullTimeHours;
			break;
			
		case 2:
			System.out.println("The employee type is part time");
			wage = hourlyWage * partTimeHours;
			break;
		default:
			System.out.println("The employee is absent");
			wage=0;
		}
		System.out.println(" Calculate daily wage of the employee " + wage);
		return wage;
	}
	
	//use case 5 calculation of wages for a month
	//Assume 20 Working Day per Month
	
	public static void calculationOfMonthlyWage() {
		System.out.println("Use case-5: Calcution of monthly wage");
		int monthlyWage = hourlyWage * fullTimeHours * totalWorkingDays ;
		System.out.println("Assuming 20 working days , monthly wage "+ monthlyWage);
	}
	
	 // Use Case 6: Calculate wage until max working hours or days are reached	
	public static void calculateWageTillCondition(Scanner sc) {
		System.out.println("Use case-6 Wage till max days");
		int hours = 0;
		int days = 0;
		int wage = 0;
		
		
		while(hours < maxMonthlyHours && days < totalWorkingDays) {
			
			days++;
			System.out.println("Enter employee type for day "+ days +" (1-full,2-part)");
			int employeeType = sc.nextInt();
			int hoursWorked = 0 ;
			
			switch(employeeType) {
			case 1: 
				hoursWorked = fullTimeHours;
				break;
			case 2:
				hoursWorked = partTimeHours;
				break;
			default:
				hoursWorked = 0;
				
			}
			
			if(hours + hoursWorked > maxMonthlyHours) {
				hoursWorked = maxMonthlyHours - hours;
			}
			
			hours = hours + hoursWorked;
			wage = wage + hoursWorked * hourlyWage;
			
			
			
		}
		
		int equivalentFullDays = hours / fullTimeHours;
		int remainingHours = hours % fullTimeHours;
		
		System.out.println("Total hours worked= "+hours);
		System.out.println("Equivalent full days "+equivalentFullDays);
		System.out.println("Actual days counted "+wage);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		boolean present = checkAttendance();
		
		if(present) {
			calculateDailyWage();
			calculatingPartTimeWage();
			calculateWageByType(sc);
			calculationOfMonthlyWage();
			calculateWageTillCondition(sc);
			
			
		}
		else {
			System.out.println("Employee absent");
		}
	}
	
	
	

}