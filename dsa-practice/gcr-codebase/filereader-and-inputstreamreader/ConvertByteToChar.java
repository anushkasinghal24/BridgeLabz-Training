/*Problem:
Write a program that uses InputStreamReader to read binary data from a file and print it as characters.
The file contains data encoded in a specific charset (e.g., UTF-8). */
import java.io.*;
import java.nio.charset.Charset;

public class ConvertByteToChar {
    public static void main(String[] args){
    String filePath = "sample.txt";   // file to read

        try (
            // Step 1: Read binary data
            FileInputStream fis = new FileInputStream(filePath);

            // Step 2: Convert byte stream to character stream (with encoding)
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

            // Step 3: Buffer the character stream
            BufferedReader br = new BufferedReader(isr)
        ) {

            String line;

            // Step 4: Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        // Step 5: Handle exceptions
        catch (UnsupportedEncodingException e){
            System.out.println("Unsupported encoding: " + e.getMessage());
        }
        catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
    
}
