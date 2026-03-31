/*Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
 */

import java.util.*;
public class RemoveExtraSpaces{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter sentence: ");
        String sentence = sc.nextLine();

        String result = sentence.replaceAll("\\s{2,}", " ");
        System.out.println(result);
    
    }
}