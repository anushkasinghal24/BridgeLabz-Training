/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
 */
import java.util.*;
public class RemoveDuplicates{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements : ");

      
        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }


        for(int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }

        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(set);

        System.out.println("List after removing duplicates : ");
        System.out.println(result);
    }

}
