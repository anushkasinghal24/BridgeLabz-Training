/*Problem:
Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file. */
import java.io.*;
public class ReadInputWriteToFile {
    public static void main(String[] args) {
        String fileName = "Sample.txt";
        try{
            InputStreamReader isr =  new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(fileName);
            System.out.println("Enter Text (type'exit' to stop : )");
            String input;

            while (true) { 
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator()); // new line
            }
            fw.close();
            System.out.println("Input succeessfully writen to fie ");
                
            

        }
            
         catch (IOException e) {
            System.out.println("Error : " +e.getMessage());
        }

        
        
    }
    
}
