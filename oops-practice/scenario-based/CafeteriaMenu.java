/*Cafeteria Menu App
Focus: Arrays, Methods
● Scenario: The campus cafeteria offers 10 fixed items daily. You need to build a system to display menu items and take orders based on user input.
● Requirements:
● Store items in a string[] array.
● Print the menu with index numbers.
● Allow the user to select an item by index.
● Use methods like DisplayMenu(), GetItemByIndex(). */

import java.util.Scanner;

public class CafeteriaMenu{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        // Fixed cafeteria menu (10 items)
        String[] cafeteriaMenu ={
                "Idli",
                "Dosa",
                "Veg Sandwich",
                "Pasta",
                "Fried Rice",
                "Veg Burger",
                "Pizza Slice",
                "Coffee",
                "Tea",
                "Fruit Juice"

        };

        // Display the menu
        displayMenu(cafeteriaMenu);

        // Ask user to select an item
        System.out.print("\nEnter the item number to order: ");
        int selectedIndex = userInput.nextInt();

        // Get item based on index
        String selectedItem = getItemByIndex( cafeteriaMenu, selectedIndex );

        // Display order result
        if (selectedItem != null){
            System.out.println("You have ordered: " + selectedItem);
        } else {
            System.out.println(" Invalid item number. Please try again. ");
        }

        userInput.close();
    }

    // Method to display cafeteria menu with index numbers
    public static void displayMenu(String[] menuItems){

        System.out.println ("----- Cafeteria Menu -----");

        for ( int index = 0; index < menuItems.length; index++ ){
            
            System.out.println( index + " : " + menuItems[index] );
        }
    }

    // Method to return menu item based on index
    public static String getItemByIndex(String[] menuItems, int index){

        if (index >= 0 && index< menuItems.length){

            return menuItems[index];

        } else{
            return null;
        }
    }
}
