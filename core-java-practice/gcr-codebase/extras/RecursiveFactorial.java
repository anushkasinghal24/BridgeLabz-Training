//package extras;

/*Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.*/
import java.util.Scanner;

public class RecursiveFactorial {

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);

        displayResult(number, result);
    }
}