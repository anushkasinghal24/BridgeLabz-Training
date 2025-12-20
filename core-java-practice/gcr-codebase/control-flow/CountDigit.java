//Count the number of digits in an integer
package controlflow;
import java.util.*;
public class CountDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		
		int count = 0; //Initialize count variable to store no. of digits
		
		if(number == 0) {
			count = 1 ;
			
		}else {
			//Use while loop to count digits
			while(number!= 0) {
				number = number / 10;
				count++;
				
			}
		}
		System.out.println("Number of digits: " + count);
	}

}
