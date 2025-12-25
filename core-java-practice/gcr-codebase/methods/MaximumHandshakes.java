/*Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/
//package methods;
import java.util.Scanner;
public class MaximumHandshakes {
	//Method to calculate handshakes using formula
	public static int calculateHandshakes(int numberOfStudents) {
		//formula = n*(n-1)/2;
		return (numberOfStudents * (numberOfStudents - 1)) / 2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of Students: ");
		int numberofStudents = sc.nextInt();
		
		int handshakes = calculateHandshakes(numberofStudents);
		
		//Display the result 
		System.out.println("The maximum no. of possible handshakes is:  " + handshakes);
		sc.close();
	}

}
