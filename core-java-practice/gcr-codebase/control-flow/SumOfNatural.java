package controlflow;
import java.util.*;
public class SumOfNatural {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if(number > 0) {
			int sumWhile = 0;
			int i = 1;
			while(i<=number) {
				sumWhile += i;
				i++;
				
			}
			int sum = number * (number+1) / 2;
			
			System.out.println("Sum using while loop: " + sumWhile);
			System.out.println("Sum using formula: " + sum);
			
			if(sumWhile == sum) {
				System.out.println("Both results are correct");
				
			}else {
				System.out.println("Both results are not equal");
			}
		}
		
	}

}
