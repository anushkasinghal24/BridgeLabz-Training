// Take the integer input, check for natural number
// and determine the factors of the number using for loop and finally print the result.
import java.util.*;
public class FactorUsingFor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		
		
		if(number > 0) {
			System.out.println("Factors of " + number + " are: ");
			
			for(int i =1 ; i< number ; i++) {
				if(number % i== 0) {
					System.out.println(i);
					
				}
			}
		}else {
			System.out.println("Please Enter a Positive Integer: ");
		} sc.close();
		
	}

}
