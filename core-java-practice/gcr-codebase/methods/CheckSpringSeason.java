/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/
//package methods;

public class CheckSpringSeason {
	
	//Method to check that it is spring season or not 
	public static boolean isSpringSeason(int month , int day) {
		if((month == 3 && day >= 20) || (month == 4 ) || (month == 5) || (month == 6 && day <= 20)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int month =Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		//Calling the method
		boolean results = isSpringSeason( month , day);
			if (results) {
				System.out.println("It's a Spring season");
			}else {
				System.out.println("Not a Spring Season");
			}
		

	}

}
