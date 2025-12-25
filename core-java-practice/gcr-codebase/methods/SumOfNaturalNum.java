/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/
//package methods;


import java.util.*;


public class SumOfNaturalNum {
	
	public static int sumUsingRecursion (int num) {
		if(num==0)
			return 0;
		
		return num+sumUsingRecursion(num-1);
	}
	
	public static int sumUsingFormula (int num) {
		return num*(num+1)/2;
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int num = sc.nextInt();
		
		if(num<=0) 
		{System.out.println("the number is not natural");
		return;
		}
		
		int sumUsingRec=sumUsingRecursion(num);
		int sumUsingFor=sumUsingFormula(num);
		
		
		System.out.println("the sum using recursion is "+sumUsingRec+" and the sum using formula is "+sumUsingFor);
		System.out.println();
		
		if(sumUsingRec==sumUsingFor) {
			System.out.println("the results are equal");
			
		}
		else {
			System.out.println("the results are not equal");
		}
		
		
		
		
	}

}
