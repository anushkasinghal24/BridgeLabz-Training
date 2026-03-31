/*Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
 */
import java.util.*;

public class ReverseQueue{

    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
        return;

    }

    int front = queue.remove();

    reverseQueue(queue);

    queue.add(front);


}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> queue = new LinkedList<>();

    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter elements: ");
    for(int i = 0; i<n; i++){
        queue.add(sc.nextInt());
    }

    System.out.println("Original queue "  + queue);
    reverseQueue(queue);
    System.out.println("Reversed queue " + queue);
}


}
