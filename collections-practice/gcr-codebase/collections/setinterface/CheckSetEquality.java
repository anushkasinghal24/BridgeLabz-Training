/*Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true. */
import java.util.*;
public class CheckSetEquality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in first set :");
        int n1 = sc.nextInt() ;
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements of first set :");
        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
        //input set 2 
        System.out.println("Enter number of elements in second set  :");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter elements of second set :");
        for(int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
        }
        //check equality
        if(set1.equals(set2)) {
            System.out.println("The two sets are equal ");
        } else {
            System.out.println("The two sets are not equal ");
        }
    }

}