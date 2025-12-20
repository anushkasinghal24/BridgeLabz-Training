
package controlflow;
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
        }
                                

        }
    
    
}
