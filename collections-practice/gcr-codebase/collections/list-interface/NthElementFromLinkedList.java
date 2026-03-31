/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D. */
import java.util.*;

public class NthElementFromLinkedList{

    public static String findnthElementFromEnd(LinkedList<String >list,int n){
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for(int i = 0; i<n; i++){

            if(!fast.hasNext()){

                return "N is larger than the list size";
            }

            fast.next();
        }


        while(fast.hasNext()){
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        LinkedList<String > list=new LinkedList<>();

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter elements : ");
        for(int i = 0; i<n ; i++){

            list.add(sc.nextLine());


        }


        System.out.println("Enter n (position from end): ");
        int pos = sc.nextInt();
        String result = findnthElementFromEnd(list , pos);

        System.out.println("Nth element from end : "+result);
    }
}
