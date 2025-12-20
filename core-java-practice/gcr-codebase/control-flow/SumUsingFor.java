//package controlflow;
import java.util.*;
public class SumUsingFor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		//Take user input
		int num = sc.nextInt();
		//Check if the numberis natural number
		if(num>0) {
			int sumUsingFor = 0;
			//Use for loop to calculate numbers
			for(int i = 1; i<=num ; i++) {
				sumUsingFor += i;
				
			}
			//Calculate sum using formula
			int sumUsingFormula = num * (num + 1 ) /2;
			//
			
			System.out.println("Sum using for loop: " + sumUsingFor);
			System.out.println("Sum using formula: " + sumUsingFormula );
			if(sumUsingFor == sumUsingFormula) {
				System.out.println("Both results are correct");
				
			}else{
				System.out.println("Results are not equal");
				
			}
		}else {
			System.out.println("The number is not a natural number");
		}
	}

}
