// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height
// I/P => base, height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.*;

public class Triangle {
    public static void main(String args[] ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the Height : ");
        int height = sc.nextInt();

        int Area = (base * height) / 2 ;

        System.out.println("The area of triangle is : " + Area);


        
    }
}

