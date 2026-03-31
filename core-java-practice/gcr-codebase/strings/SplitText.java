/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/

//2
import java.util.Scanner;

public class SplitText {

    // Method to find string length without length()
	
    static int findSizeOfString(String sentence) {
        int count = 0;
        try {
            while (true) {
            	
                sentence.charAt(count);
                count++;
            }
            
        } 
        catch (Exception e) {
        }
        
        return count;
    }

    // Method to split text using charAt()
    static String[] manualSplit(String sentence) {

        int totalLength =  findSizeOfString(sentence);
        int totalWord  = 1;

        // Count words
        for (int i = 0; i < totalLength; i++) {
            if (sentence.charAt(i)  == ' ') {
                totalWord++;
            }
            
        }
        

        // Store space indexes
        int[] spacePositions = new int [totalWord - 1];
        int index = 0;

        for (int i = 0; i < totalLength; i++) {
            if (sentence.charAt(i) == ' ') {
            	
                spacePositions[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[totalWord];
        int start = 0;
        
        int wordIndex = 0;

        for (int i = 0; i < spacePositions.length; i++) {
            String word = "";
            for (int j = start; j < spacePositions[i]; j++) {
                word += sentence.charAt(j);
            }
            words[wordIndex++] = word;
            
            start =  spacePositions[i] + 1;
        }

        // Last word to find
        String lastWord = "";
        for (int i = start; i < totalLength; i++) {
            lastWord  +=  sentence.charAt(i);
        }
        
        words[wordIndex] = lastWord;

        return words;
    }

    // Method to compare two string arrays
    static boolean compareWordArrays(String[] arr1, String[] arr2) {

        if (arr1.length !=  arr2.length) {
            return false;
            
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
            
        }return true;
        
        
    }
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter a sentence: ");
        
        String textArea  = input.nextLine();

        String[] customWords = manualSplit(textArea);
        
        String[] builtInWords = textArea.split(" ");

        boolean result = compareWordArrays(customWords,  builtInWords);

        System.out.println("Are both split results same? " + result);

        input.close();
    }
}