package controlflow;
import java.util.*;

public class OddEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1 ; i<=num ; i++) {
				if(i%2 == 0) {
					System.out.println( i + " is Even");
					
				}else {
					System.out.println( i + " is Odd");
				}
			}
		}else {
			System.out.println("Please enter a natural number");
		}
	}

}
