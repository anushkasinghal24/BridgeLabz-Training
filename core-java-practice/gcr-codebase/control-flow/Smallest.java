//Write a program to check if the first is the smallest of the 3 numbers.
//I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

//package controlflow;
import java.util.*;
public class Smallest {
    public static void main(String args[]){
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number1 : "); 
        int number1 = sc.nextInt();  // Taking first input
        System.out.println("Enter second number2 : ");
        int number2 = sc.nextInt();    //Taking second input
        System.out.println("Enter third number : " );
        int number3 = sc.nextInt();    //Taking third input
        if(number1 < number2 && number1 < number3){
            System.out.println("Is the first number the smallest? Yes");  //Print yes If the first no.is small 
        } else{
            System.out.println("Is the first number the smallest? No");   //Print No If the firstno. is not small than other two numbers
        }

        
    }


    
}
