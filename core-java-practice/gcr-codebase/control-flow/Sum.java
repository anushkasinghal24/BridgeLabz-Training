
// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result



//package controlflow;
//Create Sum class to calculate the sum of n natural numbers.
import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Taking input from the user 
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n>0){
            int sum = n * (n+1)/2 ;
            System.out.println("The sum of " + n + " natural numbers is " + sum );
        }
        else{
            System.out.println("The number " + n +   " is not a natural number");
        }sc.close();
                                

        }
    
    
}
