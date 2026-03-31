/*Scenario: You are tasked with creating a utility class for mathematical operations.
Implement the following functionalities using separate methods:
● A method to calculate the factorial of a number.
● A method to check if a number is prime.
● A method to find the greatest common divisor (GCD) of two numbers.
● A method to find the nth Fibonacci number.
● Test your methods with various inputs, including edge cases like zero, one, and
negative numbers. */
import java.util.Scanner;
public class UtilityMath {

    // Method to calculate factorial
    static long factorial(int number){
        if (number < 0){
            return -1;
        }

        long result = 1;
        for (int i = 1; i <= number; i++){
            result = result * i;
        }
        return result;
    }

    // Method to check prime number
    static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find GCD
    static int findGCD(int first, int second){
        if (first < 0) first = -first;
        if (second < 0) second = -second;

        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }

    // Method to find nth Fibonacci number
    static int fibonacci(int n){
        if (n < 0){
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0 , second = 1 , next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second ;
            first = second ;
            second = next ;
        }
        return next;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for factorial and prime check: ");
        int number = input.nextInt();

        long fact = factorial(number);
        if (fact == -1){
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + fact);
        }

        System.out.println("is Prime : " + isPrime(number));

        System.out.print("\nEnter two numbers to find GCD : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("GCD is : " + findGCD(num1, num2));

        System.out.print("\nEnter n for Fibonacci series: ");
        int n = input.nextInt();

        int fib = fibonacci(n);
        if (fib == -1){
            System.out.println("Fibonacci not defined for negative numbers ");
        } else {
            System.out.println("Fibonacci number at position " +  n  + " is: " + fib);
        }

        input.close();
    }
}
