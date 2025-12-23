/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
*/


import java.util.Scanner;

//9
public class RockPaperScissors {
	static String choiceOfComputer() {
		int value = (int)(Math.random() * 3);
		
		
		if(value == 0) {
			return "Rock" ;
			
		}else if(value == 1 ) {
			return "Paper";
		}else {
			return "Scissors";
		}
	}	/*
	     This method decides the winner of a single game
	     based on the rules of Rock-Paper-Scissors.
	     It returns:
	     "User", "Computer", or "Draw"
	    */
		static String findTheWinner(String user , String computer) {
			if(user.equals(computer)) {
				return "Draw";

		}
			
			if((user.equals("Rock") && computer.equals("Scissors")) || (user.equals("Paper") && computer.equals("Rocks")) || (user.equals("Scissors") && computer.equals("Paper"))) {
				return "User";
			}return "Computer";
		}
		/*
	     This method calculates total wins and winning percentage
	     and returns the result in a 2D String array.
	    */
		
		static String[][] calculateStats(int userWins , int computerWins, int games){
			String [][] stats = new String[2][3];
			
			double userPercent = (userWins * 100.0 ) /games;
			double computerPercent = (computerWins * 100.0) / games;
			
			stats[0][0] = "User";
	        stats[0][1] = String.valueOf(userWins);
	        stats[0][2] = String.format("%.2f", userPercent);

	        stats[1][0] = "Computer";
	        stats[1][1] = String.valueOf(computerWins);
	        stats[1][2] = String.format("%.2f", computerPercent);
	        return stats;
		}
		
		/*
	     This method displays the result of each game
	     and also displays the final statistics in tabular format.
	    */
		
		static void displayResults(String[][] gamesResult, String[][] stats) {
			System.out.println("\nGame Results: ");
			System.out.println("Game\tUser\tComputer\tWinner");
			
			for(int i = 0; i< gamesResult.length;i++) {
				System.out.println((i+1) + "\t" + gamesResult[i][0] + "\t" + gamesResult[i][1] + "\t\t" + gamesResult[i][2] );
			}
			System.out.println("\nFinal Statics: ");
			System.out.println("Player\twins\twin percentage ");
			
			for (int i = 0; i < stats.length; i++) {
	            System.out.println(stats[i][0] + "\t" +
	                               stats[i][1] + "\t" +
	                               stats[i][2] + "%");
	        }
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. of games: ");
			int games = sc.nextInt();
			sc.nextLine();
			
			String[][] gameResult = new String[games][3];
			
			int userWins = 0 ; 
			int computerWins = 0 ;
			for(int i = 0; i< games ; i++) {
				System.out.println("Enter your choice(Rock / Paper / Scissor ): ");
				String userChoice = sc.nextLine();
				String computer = choiceOfComputer();
				String winner = findTheWinner(userChoice , computer);
				if(winner.equals("User"))
					userWins++;
				else if(winner.equals("Computer"))
					computerWins++;
				 gameResult[i][0] = userChoice;
		         gameResult[i][1] = computer;
		         gameResult[i][2] = winner;
				
			}
			String[][] stats = calculateStats(userWins , computerWins, games);
			
			displayResults(gameResult , stats);
			sc.close();
					
		}
		
	

}
