/* Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/
package scenariobased;
import java.util.Scanner;
public class FestivalLuckydraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Diwali Festival Lucky Draw");
		
		while(true) {
			
			System.out.println("Enter your lucky number ( or -1 to exit ) : ");
			
			
			//Check for invalid input
			
			if(!sc.hasNextInt()) {
				System.out.println("Invalid Input : Please enter a number - "); 
				sc.next();
				continue;
			}
			int number = sc.nextInt();
			
			if( number == -1) {
				System.out.println("Lucky Draw closed");
				break;
				
			}
			//Check divisibility by 3 and 5 
			
			if( number % 3 == 0 && number % 5 == 0) {
				System.out.println("Congratulations , you won a Lucky draw gift");
			}else {
				System.out.println("Sorry !!! Better luck next time");
			}
		}
		

	}

}
