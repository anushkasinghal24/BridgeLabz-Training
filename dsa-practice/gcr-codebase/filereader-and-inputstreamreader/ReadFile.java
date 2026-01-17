/*Problem:
Write a program that uses FileReader to read a text file line by line and print each line to the console.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile{
    public static void main(String[] args) {
        String filePath = "sample.txt"; //Ensures the file exist in the project Directory
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        

        
        
    }
}