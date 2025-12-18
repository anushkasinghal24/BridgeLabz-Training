
// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.*;
public class Height {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);

    
        System.out.println("Enter Heigth in cm : ");
        double height_cm = sc.nextDouble();
        double totalInches = height_cm / 2.54;
        int feet = (int) (totalInches/12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + height_cm + " " + "while in feet is " + feet + " and inches is " + inches);

        






    }
    
}
