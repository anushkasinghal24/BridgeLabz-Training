// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
// Hint => 
// Create variables a, b, and c of int data type.
// Take user input for a, b, and c.
// Compute 3 integer operations and assign the result to a variable
// Finally, print the result and try to understand operator precedence.
// I/P => fee, discountPrecent
// O/P => The results of Int Operations are ___, ___, and ___

import java.util.*;
public class DoubleOperation {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double a = sc.nextDouble();

        System.out.println("Enter the Second number : ");
        double b = sc.nextDouble();
        System.out.println("Enter the third number :" );

        double c = sc.nextDouble();

        double ans1 = a+b*c;
        double ans2 = a*b+c;
        double ans3 = c + a/b;
        double ans4 = a%b+c;
        System.out.println("The results of IntOperations are " +ans1+", "+ ans2+", "+ ans3+" and " +ans4);





    }
    
}
