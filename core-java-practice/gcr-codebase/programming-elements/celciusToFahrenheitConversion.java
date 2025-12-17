write a program that takes the temperature in Celsius as input from the user and converts it to Fahrenheit.
import java.util.Scanner;
public class celciusToFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", celsius, fahrenheit);

        scanner.close();
    }
}