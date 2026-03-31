/*Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
 */
import java.util.*;

public class GenerateBinaryNumbers{
    public static void generateBinary(int n){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        System.out.println("Binary numbers from 1 to "+n);
        for(int i = 0; i<n; i++){
            String current = queue.remove();
            System.out.println(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        generateBinary(n);
    
    }
}