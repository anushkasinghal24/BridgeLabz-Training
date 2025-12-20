package controlflow;
import java.util.*;
public class SumOfNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //initialize total
        double total = 0.0;
        double num;

        System.out.println("Enter a number (0 to stop): ");
        num =sc.nextDouble();

        while(num != 0){
            total += num;
            System.out.println("Enter a number (0 to stop): ");
            num = sc.nextDouble();


        }
        System.out.println("The total sum is " + total);


    }
    
}
