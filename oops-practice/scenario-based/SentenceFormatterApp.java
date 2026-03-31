import java.util.Scanner;

class SentenceFormatter{

    // Method to format paragraph
    public String formatParagraph(String paragraph){

        if (paragraph == null || paragraph.trim().isEmpty()){
            return "" ;
        }

        // Remove extra spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // Ensure one space after punctuation
        paragraph = paragraph.replaceAll("([.!?])\\s*", "$1 ");


        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : paragraph.toCharArray()){
            
            if (capitalizeNext && Character.isLetter(ch)){
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '!' || ch == '?'){
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }
}

public class SentenceFormatterApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SentenceFormatter formatter = new SentenceFormatter();

        System.out.println("Enter paragraph:");
        String input = sc.nextLine();

        String output = formatter.formatParagraph(input);

        System.out.println("\nFormatted Paragraph:");
        System.out.println(output);

        
    }
}