import java.util.Scanner;

public class SumThreeNumbers {
    public static void main(String[] args) {
        int a, b, c, sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        sum = a + b + c;

        System.out.println("Sum of three numbers = " + sum);

        sc.close();
    }
}
