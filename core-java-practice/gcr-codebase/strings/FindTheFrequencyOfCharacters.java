/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/



import java.util.Scanner;

public class FindTheFrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:" );
        String text = sc.nextLine();
     // Call method to calculate frequency of unique characters
        String[][] frequency = calculateFrequencyUnique(text);
        
        //Display table header
        System.out.println("Character\tFrequency");
        System.out.println("----------------------");
        
        
        //Dislay each character and its frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][0] != null) {
                System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
            }
        }
    }
    
    
    /*
    This method finds the length of a string
    without using the built-in length() method.
    It keeps accessing characters using charAt()
    until an exception occurs.
   */
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    
    /*
    This method calculates the frequency of each unique character
    in the string without using any built-in frequency functions.
    It returns a 2D String array containing:
    [character][frequency]
   */
    
    public static String[][] calculateFrequencyUnique(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
            	
                uniqueChars[uniqueCount] = currentChar;
                
                uniqueCount++;
            }
        }
        
        String[][] result = new String[uniqueCount][2];
        
        for (int i = 0; i < uniqueCount;  i++) {
        	
            char currentChar =  uniqueChars[i];
            int freq = 0;
            
            for (int j  = 0; j < length; j++) {
                if (text.charAt(j) == currentChar) {
                    freq++;
                }
            }
            
            result[i][0] = String.valueOf (currentChar);
            result[i][1] = String.valueOf (freq);
        }return result;
        
        
    }
} 