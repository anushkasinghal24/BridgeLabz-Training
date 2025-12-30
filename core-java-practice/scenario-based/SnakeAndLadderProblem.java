//package scenariobased;
import java.util.*;
public class SnakeAndLadderProblem {
	
	static final int noPlay = 0;
	static final int ladder = 1 ;
	static final int snake = 2;
	static final int winningPosition = 100;
	
	static Random random = new Random();
	static Scanner sc = new Scanner(System.in);
	// Use Case 2 - Roll the dice (1 to 6)
	static int rollTheDice() {
		return random.nextInt(6) + 1;
		
	}
	
	//Use Case - get option(No play , Ladder , Snake )
	
	static int getOption() {
		return random.nextInt(3);
	}
	
	//Calculate new position 
	static int getNewPosition (int position , int die , int option) {
		int previousPosition = position;
		
		switch(option) {
		case noPlay:
			break;
		case ladder:
			position += die;
			break;
		case snake : 
			position -= die;
			break;
		}
		
		//Position should not go below 0;
		if(position < 0)
			position = 0;
		//Exact 100 condition 
		
		if(position > winningPosition)
			position = previousPosition;
		
		return position;
		
	}
	
	//play turn for a player
	static boolean playTurn(String playerName , int[] position , int[] diceCount , int index) {
		System.out.println("\n" + playerName + "Press ENTER Button to roll the dice");
		sc.nextLine();
		int die = rollTheDice();
		int option = getOption();
		diceCount[index]++;
		System.out.println(playerName + " rolls die:" + die);
		position[index] = getNewPosition(position [index], die , option);
		
		switch(option) {
			case noPlay:
				System.out.println("Option ; No Play ");
				break;
			case ladder:
				System.out.println("Option ; Ladder");
				break;
			case snake: 
				System.out.println("Option : Snake");
				break;
			
		}
		System.out.println(playerName + "Position : " + position[index]);
		
		//Use Case -7 : Extra turn on ladder
		
		return option == ladder;
		
		
	}
	
	//Start Game 
	static void startGame() {
		System.out.println("Choose Mode : " );
		System.out.println("1. Single Player");
		System.out.println("2. Two Player");
		int mode = sc.nextInt();
		sc.nextLine();
		
		String[] players;
		int[] positions;
		int[] diceCount;
		if(mode == 1) {
			System.out.print("Enter Player Name : ");
			players = new String[] {sc.nextLine()};
			positions = new int[] {0};
			diceCount = new int[] {0};
			
			System.out.println("\n  Game Started (single player)");
			while (positions[0] < winningPosition) {
				playTurn(players[0] , positions , diceCount , 0);
				
			}
			System.out.println("\n " + players[0] + "WOn !");
			System.out.println("Total dice rolls : " + diceCount[0]);
		}else {
			//Two Player
			System.out.print("Enter player 1 name : ");
			String p1 = sc.nextLine();
			
			System.out.println("Enter player 2 name : ");
			String p2 = sc.nextLine();
			
			players = new String[] {p1, p2};
			positions = new int[] {0,0};
			diceCount = new int[] {0,0};
			
			boolean playerOneTurn = true;
			
			System.out.println("\n Game Started (Two players )");
			
			while(positions[0] < winningPosition  && positions[1] < winningPosition) {
				if(playerOneTurn) {
					boolean extraTurn = 
							playTurn(players[0] , positions  , diceCount , 0);
					if(!extraTurn)
						playerOneTurn = false;
					
				}else {
					boolean extraTurn = 
							playTurn (players[1] , positions , diceCount , 1);
					if(!extraTurn)
						playerOneTurn = true;
				}
			}
			if (positions[0] == winningPosition) {
                System.out.println("\n " + players[0] + " WON!");
                System.out.println("Dice rolls: " + diceCount[0]);
            } else {
                System.out.println("\n " + players[1] + " WON!");
                System.out.println("Dice rolls: " + diceCount[1]);
            }
		}
		
		
		
	}
	public static void main(String[] args) {
		startGame();
	}
		
	

}
