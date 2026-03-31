
/*Write a program to find the frequency of characters in a string using the charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using the charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/




import java.util.Scanner;

public class FreqOfCharUsingCharAt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        String text = sc.nextLine();
        // Call method to calculate character frequencies
        String[][] frequency = calculateFrequency(text);
        
        System.out.println("Character\tFrequency");
        System.out.println("----------------------");
     // Display character and its frequency
        for (int i = 0; i < frequency.length; i++) {
        	 // Check to avoid printing null values
            if (frequency[i][0] != null) {
                System.out.println(frequency[i][0]  + "\t\t"  + frequency[i][1]);
            }
        }
    }
    /*
    This method calculates the frequency of characters in a string
    using ASCII values as indexes.
    It returns a 2D String array containing characters and frequencies.
   */
    
    public static String[][] calculateFrequency(String text) {
        int[] freq = new int[256] ;
        
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        //Count number of unique Characters
        
        int count = 0;
        for (int i = 0; i < 256; i++)
        {
            if (freq[i] >  0)
            {
                count++;
            }
        }
        //Create 2D array to store character and its frequency
        String[][] result = new String[count][2];
        int index = 0;
        
        for (int i = 0 ; i < 256;  i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                
                //Convert frequency to string
                result[index][1]  = String.valueOf(freq[i]);
                index++;
            }
        } return result;
        
       
    }
} 