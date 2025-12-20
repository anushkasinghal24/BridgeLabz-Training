import java.util.*;
//Creating class with name AbundantNumber indicating the purpose is to 
//check the number is Abundant or not
public class AbundantNumber {

	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner sc = new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		
		int sum = 0 ;
		//Using for loop
		for(int i = 0 ; i< number ; i++) {
			if(number%i == 0) {
				sum = sum+i;
				}
		
		}if(sum > number) {
			System.out.println(number + " is an Abundant Number");
		}else {
			System.out.println(number + " is not an Abundant Number");
		}sc.close(); // Closing the Scanner Stream

	}

}
