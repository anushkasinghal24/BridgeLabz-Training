/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
*/
//package methods;
import java.util.Scanner;

public class DivideNumberOfChocolates {
	//Method to calculate chocolates per child and remaining
	
	
	public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren ) {
		int chocolatePerChild = numberOfChocolates / numberOfChildren ;
		int remainingChocolates = numberOfChocolates % numberOfChildren;
		
		return new int[] {chocolatePerChild , remainingChocolates};
	}
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numberof chocolates: ");
		int numberOfChocolates = sc.nextInt();
		
		System.out.println("Enter number of CHildren: ");
		int numberOfChildren = sc.nextInt();
		
		//Calling method 
		int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
		
		System.out.println("Each child will get " + result[0] + " chocolates");
		System.out.println("Remainign chocolates = " + result[1]);
		sc.close();

	}

}
