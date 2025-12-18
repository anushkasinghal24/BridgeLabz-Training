// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java .util.*;

public class Yard{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the distance in feets : ");

        float distanceInFeet = sc.nextFloat();
        System.out.println("Your Height in cm is : " + distanceInFeet * 12 * 2.54 + " while in feet is " + distanceInFeet + " and in inches is " + distanceInFeet * 12);
    
    
    }
}