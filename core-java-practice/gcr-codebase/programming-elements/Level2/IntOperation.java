import java.util.*;

public class IntOperation {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number :" );

        int c = sc.nextInt();

        int ans1 = a+b*c;
        int ans2 = a*b+c;
        int ans3 = c + a/b;
        int ans4 = a%b+c;
        System.out.println("The results of IntOperations are " +ans1+", "+ ans2+", "+ ans3+" and " +ans4);

    }
    
}
