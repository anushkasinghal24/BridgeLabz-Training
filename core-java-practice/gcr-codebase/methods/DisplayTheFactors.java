/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method*/
//package methods;



import java.util.*;

public class DisplayTheFactors {
	//Method to find all factors of a number
	static int[] findFactors(int n) {
		//Count how many factors exist
		int count=0;
		for(int i=1;i<=n;i++)
			
			if(n%i==0) {
				count++;
			}
		//Create array
		int factor[]=new int[count];
		
		int id=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factor[id++]=i;
				
			}
		}
		return factor;
	}
	//Method to find sum of all elemets 
	static int sumOfArray(int[] array) {
		int sum=0;
		for(int i:array) {
			sum=sum+i;
		}
		return sum;
	}
	//Method to find product of elements of an array
	static long product(int[] arr) {
		long prod=1;
		for(int i:arr) {
			prod=prod*i;
		}
		return prod;
	}
	//method to find sum of squares of an element 
	
	static double squareSum (int[] arr) {
		double sum=0;
		for(int i:arr) {
			sum=sum+Math.pow (i, 2);
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter");
		int num=sc.nextInt();
		
		int[] factors=findFactors (num);
		
		System.out.println("the factors are");
		for(int i:factors) {
			System.out.println(i+" ");
			
			
		}
		
		System.out.println("The sum is "+ sumOfArray(factors));
		System.out.println("The product is "+ product(factors));
		System.out.println("The sum of squares "+ squareSum(factors));
	}
	
}
