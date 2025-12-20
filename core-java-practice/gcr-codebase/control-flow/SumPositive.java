package controlflow;
import java.util.*;
public class SumPositive {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	//Initialize total
    	double total  = 0.0;
    	while(true) {
    		System.out.println("Enter a number (0 to negative to stop) : ");
    		double num = sc.nextDouble();
    		if(num <= 0) {
    			break;
    		}
    		total = total + num;
    		
    	}
    	System.out.println("The total sum is " +total);
    	sc.close();
        
    }
    
}
