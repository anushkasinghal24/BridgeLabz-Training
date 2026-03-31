// Write a program to create a calculator using switch...case.
// Hint => 
// Create two double variables named first and second and a String variable named op.
// Get input values for all variables.
// The input for the operator can only be one of the four values: "+", "-", "*" or "/".
// Run a for loop from i = 1 to i < number.
// Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
// If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
// If op is neither of those 4 values, print Invalid Operator.

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
