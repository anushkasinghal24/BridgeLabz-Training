
import java.util.*;
public class GreatestFactorUsingWhile {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number =sc.nextInt();
		int greatestFactor = 1;
		
		if(number > 1) {
			int counter = number  -1 ;
			//Use while loop to find the greatest factor 
			while(counter >= 1) { 
				//Check if the no. is perfectly divisible by counter
				if(number % counter == 0 ) {
					greatestFactor = counter;
					//Exit the loop greatest factor if found
					break;
				}
				counter--;
			}System.out.println("Greatest factor of " + number + "beside itself is " + greatestFactor);
			
		}else {
			System.out.println("Please enter an integer greater than 1 ");
		}
		
		sc.close();
		
		

	}

}
