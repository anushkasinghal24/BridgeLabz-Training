/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/
//Q-1 L3
//package methods;
import java.util.Random;
public class HeightOfPlayers {
	//Method to find sum of all height 
	
	public static int findSumOfAll(int[] heights ) {
		int sum = 0 ; 
		for(int height : heights) {
			sum += height;
		}
		return sum;
	}
	
	//Method to find mean height 
	public static double findMeanOfAll(int[] heights) {
		int sum = findSumOfAll(heights);
		return (double) sum / heights.length;
	}
	
	//Method to find Shortest height 
	public static int findShortest(int[] heights) {
		int shortest = heights[0];
		for(int height : heights) {
			if(height < shortest ) {
				shortest = height;
			}
		}return shortest;
	}
	
	//Method to find tallest height 
	public static int findTallest(int[] heights) {
		int tallest = heights[0];
		for(int height : heights){
			if(height > tallest ){
				tallest = height ;
			}
		}return tallest;
	}

	public static void main(String[] args) {
		
		//Array to store height 
		int[] heights = new int[11];
		Random random = new Random();
				
		System.out.println("Height of all football players (in cms ): ");
		for(int i = 0 ; i< heights.length ; i++) {
			heights[i] = 150 + random.nextInt(101) ;
			System.out.println(heights[i] + " ");
		}
		System.out.println();
		
		//calling methods 
		int sum = findSumOfAll(heights);
		double mean = findMeanOfAll(heights);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);
		
		//Display the result of heights 
		System.out.println("\nTotal height of players: " + sum + " cms");
		System.out.println("Mean height of players : " + mean + " cms ");
		System.out.println("Shortest height of player is " + shortest + "cms");
		System.out.println("Tallest height of player is " + tallest + " cms ");

	}

}
