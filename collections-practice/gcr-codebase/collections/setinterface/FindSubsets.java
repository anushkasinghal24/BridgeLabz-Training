/*Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
 */
import java.util.*;
public class FindSubsets {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter size of set 1: ");
        int n1= sc.nextInt();
        System.out.println("Enter elements of set 1:");
        for(int i = 0; i<n1; i++){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter size of set2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elemenst of set2: ");
        for(int i = 0 ; i<n2; i++){
            set2.add(sc.nextInt());

        }

        //Subset check
        System.out.println("Subsets of set1 in set2:");

        if(set2.containsAll(set1)){
            System.out.println("set1 is a subset of set2");
        }
        else{
            System.out.println("set1 is not a subset of set2");
        }

        
    }
    
}
