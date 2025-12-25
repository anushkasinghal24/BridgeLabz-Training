/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
*/
//package methods;
import java.util.Scanner;
public class FindSmallestAndLargest {
	//method to find the smallest and largest of three numbers
	public static void findNumber(int a , int b , int c) {
		int smallest = a; 
		int largest = a;
		
		//Compare with the second number
		
		if(b < smallest) {
			smallest = b;
			
		}
		if(b > largest ) {
			largest = b;
		}
		//Compare with third number
		if(c < smallest) {
			smallest = c;
			
		}
		if(c > largest) {
			largest = c;
		}
		System.out.println("Smallest number is : " + smallest);
		System.out.println("Largest number is : " + largest);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNum = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int thirdNum = sc.nextInt();
		
		findNumber(firstNum , secondNum, thirdNum);
		
		sc.close();
		
		

	}

}
