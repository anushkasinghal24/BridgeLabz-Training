//package classesandobjects;
// Public class must match the file name: PalindromeChecker.java
public class PalindromeChecker{
    // Attribute to store the text
    String text;

    // Constructor to initialize the text
    PalindromeChecker(String text){
        this.text = text;
    }

    // Method to check if the text is a palindrome
    boolean isPalindrome(){
        // Convert text to lowercase and remove spaces for easy comparison
        String cleanedText = text.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = cleanedText.length() - 1;

        // Compare characters from start and end
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It is a palindrome
    }

    // Method to display the result
    void displayResult(){
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    // Main method to run the program
    public static void main(String[] args){
        // Create objects for testing
        PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");

        // Display results
        checker1.displayResult();
        checker2.displayResult();
    }
}
