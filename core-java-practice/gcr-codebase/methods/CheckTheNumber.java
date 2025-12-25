//package methods;
import java.util.Scanner;

public class CheckTheNumber {

	//Conditions to check that the number is positive , negative or zero.
		public static int checkNumber(int number){
			if(number > 0) {
				return 1 ;
			}else if(number < 0) {
				return -1;
			}else {
				return 0;
			}
			
		}
		public static void main(String[] args ) {
			Scanner sc = new Scanner(System.in);
			
			//Taking input
			
			System.out.println("Enter a number: ");
			int number = sc.nextInt();
			
			//Calling method 
			int result = checkNumber(number);
			
			//Display the reuslt 
			if(result == 1) {
				System.out.println("The number is Positive. ");
			}else if(result == -1) {
				System.out.println("The number is negative.");
			}else {
				System.out.println("The number is Zero.");
				
			}sc.close();
			
		}

	

}
