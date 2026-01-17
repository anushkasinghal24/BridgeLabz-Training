/*Write a program that:
Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
 */
import java.io.*;

public class IOComparison {
    //stringbuilder vs stringbuffer
    public static void compareStringConcatenation() {
        int iterations = 1000000;
        String text = "hello";
        //stringBuilder
        long startBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ms");
        //stringBuffer
        long startBuffer = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sf.append(text);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ms");
    }
    //fileReader word count
    public static void countWordsUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    wordCount += line.trim().split("\\s+").length;
                }
            }

        } catch (IOException e) {
            System.out.println("FileReader Error");
            return;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Word Count: " + wordCount);
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");
    }

    //inputStreamReader word count
    public static void countWordsUsingInputStreamReader(String filePath) {

        long startTime = System.currentTimeMillis();
        int wordCount = 0;

        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    wordCount += line.trim().split("\\s+").length;
                }
            }

        } catch (IOException e) {
            System.out.println("InputStreamReader Error");
            return;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Word Count: " + wordCount);
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        String filePath = "sample.txt"; // 100MB text file
        System.out.println("--- StringBuilder vs StringBuffer ---");
        compareStringConcatenation();
        System.out.println("\n--- FileReader Word Count ---");
        countWordsUsingFileReader(filePath);
        System.out.println("\n--- InputStreamReader Word Count ---");
        countWordsUsingInputStreamReader(filePath);
    }
}