/*Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
 */
import java.util.*;
public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set =  new HashSet<>();


        System.out.println("Enter number of elements in the set :");
        int n = sc.nextInt() ;
        System.out.println("Enter elements of the set :") ;
        for(int i = 0; i < n; i++){

            set.add(sc.nextInt());
        }
        //Convert Set to List
        List<Integer> list = new ArrayList<>(set);
        //Sort the List
        Collections.sort(list);
        System.out.println("Sorted List : " + list);

    }
    
}
