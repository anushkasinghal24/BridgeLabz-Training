/*Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint => 
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the following code 
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
Write a Method to Print the players and their cards

*/
//package strings;

import java.util.Scanner;
public class DeckOfCards 
{
	static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numOfCards = suits.length * ranks.length; 
	    String[] deck = initializeDeck();
	    System.out.println("Deck initialized with " + numOfCards + " cards ");
	    
	    shuffleDeck(deck);
	    System.out.println("Deck shuffled successfully. \n");
	    
	    System.out.print("Enter number of players: ");
	    int players = sc.nextInt();
	    
	    System.out.print("Enter number of cards per palyer: ");
	    int cardsPerPlayer = sc.nextInt();
	    
	    String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
	    
	    if (distributedCards != null) {
	        printPlayers(distributedCards);
	    }
	    
	}
	public static String[] initializeDeck() {
	    int index = 0;
	    String[] deck = new String[suits.length * ranks.length];
	    
	    for (String suit : suits) {
	        for (String rank : ranks) {
	            deck[index++] = rank + "of" + suit;
	        }
	    }
	    return deck;
	}
	public static void shuffleDeck(String[] deck) {
	    int n = deck.length;
	    
	    for (int i = 0; i < n; i++) {
	        int randomCardNumber = i + (int) (Math.random() * (n-i));
	        
	        String temp = deck[i];
	        deck[i] = deck[randomCardNumber];
	        deck[randomCardNumber] = temp;
	    }
	}
	public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
	    int totalREquiredCards = players * cardsPerPlayer;
	    
	    if (totalREquiredCards > deck.length) {
	        System.out.println("Not enough cards to distribute.");
	        return null;
	    }
	    String[][] playerCards = new String[players][cardsPerPlayer];
	    int cardIndex = 0;
	    
	    for (int i = 0; i < players; i++) {
	        for (int j = 0; j < cardsPerPlayer; j++) {
	            playerCards[i][j] = deck[cardIndex++];
	        }
	    }
	    return playerCards;
	}
	public static void printPlayers(String[][] players) {
	    for (int i = 0; i < players.length; i++) {
	        System.out.println("Player " + (i + 1) + " cards:");
	        for (int j = 0; j < players[i].length; j++) {
	            System.out.println(" " + players[i][j]);
	        }
	        System.out.println();
	    }
	}
}