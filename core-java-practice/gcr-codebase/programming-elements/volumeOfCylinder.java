//Write a program to calculate the colume of a cylinder given its radius and height.

import java.util.*;
public class volumeOfCylinder{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double volume = Math.PI * radius * radius * height;
        System.out.println( "Area of Cylinder is :" + volume);
       


    }
}