//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;



//package controlflow;
import java.util.*;
public class SumPositive {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	//Initialize total
    	double total  = 0.0;
		//use while loop true
    	while(true) {
    		System.out.println("Enter a number (0 to negative to stop) : ");
    		double num = sc.nextDouble();
			//Check if the number is less than or equal to 0
    		if(num <= 0) {
    			break;
    		}

    		total = total + num;
    		
    	}
    	System.out.println("The total sum is " +total);
    	sc.close();
        
    }
    
}
