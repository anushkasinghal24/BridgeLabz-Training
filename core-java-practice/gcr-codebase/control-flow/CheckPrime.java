package controlflow;
import java.util.*;
public class CheckPrime {
	public static void main(String args[]) {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
			
		}else {
			//Loop from 2 to number -1
			for(int i = 2; i<number; i++) {
				if(number % i == 0) {
					isPrime = false;
					break; //Number is divisible by another number
				}
			}
			
			
		}
		if(isPrime) {
			System.out.println(number + " is a Prime Number");
		}else {
			System.out.println(number + " is not a Prime Number");
		}
		
	}

}
