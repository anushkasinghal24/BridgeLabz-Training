// Calculate average of three numbers 

import java.util.*;
public class averageNumber{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int average = (first + second + third)/3;
        System.out.println("Average of three numbers is : " + average);
    }
    
}