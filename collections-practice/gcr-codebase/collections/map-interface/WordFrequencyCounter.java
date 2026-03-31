/*Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
 */
import java.io.*;
import java.util.*;

public class WordFrequencyCounter{

    public static void main(String[] args){

        // File name in the same directory as the program
        String filePath = "input.txt";

        // HashMap to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>() ;

        try {
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNext()) {
                // Convert to lowercase and remove punctuation
                String word = fileScanner.next()
                        .toLowerCase()
                        .replaceAll("[^a-z]", "") ;

                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1) ;
                }
            }

            fileScanner.close();
            System.out.println("Word Frequency: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File 'input.txt' not found. Please place it in the project folder");
        }
    }
}
