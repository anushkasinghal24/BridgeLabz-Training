/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/
//package methods;


import java.util.*;

public class YoungestFriends {
	//Method to find the youngest friend
	public static String youngest(String[] names,int[] ages) { 
		int min=ages[0];
		int index=0;
		for(int i=1;i<ages.length;i++ ) {
			if(ages[i]<min) {
				min=ages[i];
				index=i;
			}
		}
		//return name of youngest friend 
		return names[index];
		
	} 
	//Method to find tallest friend
	public static String tallest( String[] names, double[] height) {
		
		double max=height[0];
		int ind=0;
		for(int i=0;i<height.length;i++) {
			if(height[i]>max) {
				
				max=height[i];
				ind=i;
			}
		}
		return names[ind];
		
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Amar","Akbar","Anthony"};
		
		int[] age = new int[3];
		double[] height = new double[3];
		
		System.out.println("Enter the ages of amar, akbar, anthony respectively");
		
		for(int i=0;i<3;i++) {
			age[i]=sc.nextInt();
		}
		System.out.println("Enter the heights of amar, akbar, athony respectively");
		for(int i=0;i<3;i++) {
			
			height[i]=sc.nextDouble();
		}
		
		System.out.println("The tallest friend is "+tallest(names,height));
		
		System.out.println("The youngest friend is "+youngest(names,age));
		
		
		
	}

}
