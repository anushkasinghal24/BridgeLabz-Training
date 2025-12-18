
import java.util.*;
public class kilometerToMiles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Miles is:" + miles);
    }
    
}
