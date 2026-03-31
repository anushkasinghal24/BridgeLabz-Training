/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.Scanner;

public class FindStringLength {

    // Method to calculate length without using length()
    static int calculateSize(String textInput) {
    	
        int counter = 0;

        try {
            
            while (true) {
                textInput.charAt(counter);
                counter++;
            }
        } 
        catch (Exception e) {
            // Stops when index goes out of range
        }return counter;

        
    }

    public static void main(String[] args) {
        //Taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String userInput = sc.next();
        

        int customLength =  calculateSize(userInput);
        
        int builtInLength = userInput.length();
        //Display Output
        System.out.println("Length by using User Method: " + customLength);
        System.out.println("Length by using Built-in Method: " + builtInLength);

        sc.close();
    }
}