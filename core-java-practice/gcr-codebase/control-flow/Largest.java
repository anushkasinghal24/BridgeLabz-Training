// Creating class with name LargestOfThree indicating the purpose is to
// check whether the first, second, or third number is the largest
package controlflow;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        // Create a  Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter first number: ");
        int number1 =sc.nextInt();

        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the largest
        boolean isFirstLargest = (number1  > number2) && (number1 > number3);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) &&  (number2 > number3);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 >  number1) && (number3 > number2);

        // Display the results
        System.out.println ("Is the first number the largest? " +  isFirstLargest);
        System.out.println ("Is the second number the largest? " + isSecondLargest);
        System.out.println ("Is the third number the largest? " + isThirdLargest);

        // Close the Scanner object
        sc.close();
    }
}
