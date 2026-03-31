/*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5. */
//Taking user input
import java.util.Scanner;
public class LengthOfLastWord {
    public int lengthOfLastWord(String s){

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a string : ");
        String input = sc.nextLine();

        LengthOfLastWord solution = new LengthOfLastWord();
        int length = solution.lengthOfLastWord(input);
        System.out.println("Length of the last word : " + length);
        
    }
}