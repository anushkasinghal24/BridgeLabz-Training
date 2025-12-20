// Take the integer input, check for natural number 
//and determine the factorial using for loop and finally print the result. 
import java.util.*;
public class FactorialFor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			
			int fact = 1;
			//Use for loop to compute factorial
			for(int i = 1 ; i<=num ; i++) {
				fact*= i ;
	
			}
			System.out.println("Factorial of " + num + " is " + fact);
		
		}else {
			System.out.println("Please enter a natural number");
			
		}
	}

}
