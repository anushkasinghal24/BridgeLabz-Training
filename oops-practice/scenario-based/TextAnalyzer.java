import java.util.Scanner;

class TextAnalyzer{

    // Count words
    public int countWords(String paragraph){
        if (paragraph == null || paragraph.trim().isEmpty()){
            return 0;
        }
        return paragraph.trim().split("\\s+").length;
    }

    // Find longest word
    public String findLongestWord(String paragraph){
        if (paragraph == null || paragraph.trim().isEmpty()){
            return "" ;
        }

        String[] words = paragraph.trim().split("\\s+");
        String longest = words[0];

        for (String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }

        return longest;
    }

    // Replace word (case-insensitive)
    public String replaceWord(String paragraph, String oldWord, String newWord){
        if (paragraph == null || paragraph.trim().isEmpty()) {
            
            return "";
        }
        return paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }
}

class ParagraphAnalyzerApp{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TextAnalyzer analyzer = new TextAnalyzer();

        System.out.println("Enter paragraph:");

        String paragraph = sc.nextLine();

        System.out.println("\nWord Count: " + analyzer.countWords(paragraph));

        System.out.println("Longest Word: " + analyzer.findLongestWord(paragraph));

        System.out.print("\nEnter word to replace: ");

        String oldWord = sc.nextLine();

        System.out.print("Enter replacement word: ");

        String newWord = sc.nextLine();

        String updatedText = analyzer.replaceWord(paragraph, oldWord, newWord);

        System.out.println("\nUpdated Paragraph:");
        System.out.println(updatedText);

        sc.close();
    }
}