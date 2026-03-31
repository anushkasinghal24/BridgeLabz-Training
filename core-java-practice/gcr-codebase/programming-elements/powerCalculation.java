// Write  a program that takes two numbers as input a base and an exponent, and prints the result of base raised to the exponent (without using loop or conditionals).

import java.util.Scanner;
public class powerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent number: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.printf("%.2f raised to the power of %.2f is: %.2f%n", base, exponent, result);

        scanner.close();
    }
}

