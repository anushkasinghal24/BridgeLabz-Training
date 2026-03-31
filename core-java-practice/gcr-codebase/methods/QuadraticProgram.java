/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/

//package methods;

import java.util.*;


public class QuadraticProgram {
	//Methods to calculate roots of the quadratic equaltion
	public static double[] roots(double a, double b, double c ) {
		double delta=Math.pow(b, 2)-4*a*c;
		//case 1 = two distinct real roots (delta > 0)
		if(delta>0) {
			double r1=(-b+Math.sqrt(delta))/(2*a);
			double r2=(-b-Math.sqrt(delta))/(2*a);
			//return both roots
			return new double[] {r1,r2};
		}
		//One real root (delta == 0)
		else if(delta==0) {
			double r=-b/(2*a);
			//return single root 
			return new double[] {r};
			}
		//No real roots (delta < 0)
		else {
			
			return new double[] {};
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b,c");
		double a=sc.nextDouble();
		
		double b=sc.nextDouble();
		
		double c=sc.nextDouble();
		
		double[] root=roots(a,b,c);
		
		if(root.length == 2) {
			System.out.println("Two roots "+root[0]+" , "+root[1]);
			
		}
		else if(root.length == 1) {
			System.out.println("One root "+root[0]);
		}
		
		else {
			System.out.println("No real roots");
		}
	}
	
	

}
