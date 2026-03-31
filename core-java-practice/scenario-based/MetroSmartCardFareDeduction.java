/* Metro Smart Card Fare Deduction 🚇
In Delhi Metro, fare varies by distance.
● Ask the user for distance.
● Calculate fare using ternary operator.
● Deduct from smart card balance.
Loop until balance is exhausted or the user quits.*/

//package scenariobased;
import java.util.Scanner;
public class MetroSmartCardFareDeduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = sc.nextInt();
		
		while(balance> 0) {
			System.out.println("Enter distance in km: ");
			int distance = sc.nextInt();
			
			if(distance == -1) {
				break;
			}
			//fare calculation using ternary operator 
			int fare = (distance <= 5 )? 10 : (distance <= 15) ? 20 : 30;
			
			//Check sufficient balance
			if(balance >= fare) {
				balance = balance - fare;
				System.out.println("Fare Deducted of Rs " + fare);
				System.out.println("Remaining Balance of Rs " + balance);
				
			}else {
				System.out.println("Insufficient Balance!");
				break;
			}
		}
		System.out.println("\n Thankyou for using Delhi Metro , Travel Again!!");
		sc.close();
		

	}

}
