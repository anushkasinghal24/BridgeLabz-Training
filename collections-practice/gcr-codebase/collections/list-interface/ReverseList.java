


/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
 */
import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();  
        sc.nextLine();
        System.out.println("Enter the elements of the list separated by spaces:");
        for(int i = 0; i<n; i++){
            list.add(sc.nextLine());

        }
        System.out.println("Enter N : ");
        int k = sc.nextInt();

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();
        for(int i = 0; i<k; i++){
            if(!fast.hasNext()){
                System.out.println("Invalid N");
                return;
            }
            fast.next();

        }
         while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        System.out.println("Nth element from end: " + slow.next());
        sc.close();

    }
    
}
