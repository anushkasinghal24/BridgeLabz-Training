//
//Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___

//To check that the no. is divisible by 5 or not 
package controlflow;
import java.util.*;
public class Divisible {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : "); 
        int number = sc.nextInt();  // Taking Input 
        if(number%5 == 0){
            System.out.println("Is the " + number + " divisible by 5? Yes "); //Print Output
        }else{
            System.out.println("Is the " + number +" divisible by 5? No ");

        }


        }
    
}
