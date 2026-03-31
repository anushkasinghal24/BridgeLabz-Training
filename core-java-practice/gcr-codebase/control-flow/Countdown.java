
// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
// Hint => 
// Create a variable counter to take user inputted value for the countdown.
// Use the for loop to check if the counter is 1
// Inside a for loop, print the value of the counter and decrement the counter.

import java.util.*;

public class Countdown {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int counter = sc.nextInt();
        //Use for loop if the counter is 1 ormore than 1
        for(int i = counter ; i>=1 ; i--){
            System.out.println(i);
        }sc.close();
        
    }
    
}
