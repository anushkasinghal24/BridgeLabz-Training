/* Problem:
Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountWord {
    public static void main(String[] args) {
        String targetWord = "Anushka"; // Ensure the file exists in the project directory
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;

            //Read File Line by line 
            while((line = br.readLine()) != null){
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++; // increment counter
                    }
                }
            }
            System.out.println("The Word \"" + targetWord + "\" appears " + count + " times");

            


        }catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }
        
    }
    
}

/*Part	Meaning
\\	Escape character for Java string
\W	Any non-word character
+	One or more times */
