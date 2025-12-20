package controlflow;
import java.util.*;
//Performing basic airthmetic operations using switch case
public class CalculatorSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double first= sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double second = sc.nextDouble();
		
		System.out.println("Enetr operator (+ , -, *, /): ");
		String operator = sc.next();
		//Use switch case to perform the selected operations
		switch(operator){
			case "+":
				System.out.println("Result: " + (first + second));
				break;
			case "-":
				System.out.println("Result: " + (first - second));
				break;
			case "*":
				System.out.println("Result: " + (first * second));
				break;
			case "/":
				if(second != 0) {
					System.out.println("Result: " +(first/second));
					
				}else {
					System.out.println("Division by zero is not allowed");
				}
				break;
				
			default:
				System.out.println("Invalid Operator");
				
				
				
		}
		
	}

}
