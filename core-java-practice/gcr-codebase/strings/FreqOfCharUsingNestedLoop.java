/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in a frequency array. For this use a Nested Loop with an Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create a 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/



import java.util.Scanner;

public class FreqOfCharUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        
     // Call method to calculate character frequencies
        
        String[] frequency = calculateFrequencyNested(text);
        //Display the header
        System.out.println("Character\tFrequency");
        System.out.println("----------------------");
        for (int i = 0; i < frequency.length; i += 2) {
        	//Check to avoid null
            if (frequency[i] !=  null && !frequency[i].equals("0")) {
            	   
                System.out.println(frequency[i]  + "\t\t" +  frequency[i + 1]);
            }
        }
    }
    
    public static String[] calculateFrequencyNested(String text) 
    {
    	//Convertstring to character array
        char[] chars = text.toCharArray();
        String[] result = new String[chars.length *  2] ;
        
        int resultIndex = 0;
        
        for (int i = 0; i < chars.length; i++) {
        	
            if (chars[i] == '0') {
                continue;
            }
            
            char currentChar = chars[i];
            int freq = 1;
            
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == currentChar) {
                    freq++;
                    chars[j] = '0';
                }
            }
            //Store character and its frequency in result array
            result[resultIndex] = String.valueOf(currentChar);
            result[resultIndex + 1] = String.valueOf(freq);
            resultIndex += 2;
        }
        //Return the frequency array
        return result;
    }
} 
