/*Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
 */
import java.util.*;
public class SymmetricDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input sets 
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter number of elements in first set :");
        int n1 = sc.nextInt() ;
        System.out.println("Enter elements of first set :"); 

        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter number of elements in second set  :");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second set :");
        for(int i = 0; i < n2; i++){

            set2.add(sc.nextInt());
        }
        //Symmetric Difference
        Set<Integer> symDiffSet = new HashSet<>(set1);
        symDiffSet.addAll(set2);
        
        Set<Integer> tmpSet = new HashSet<>(set1) ;

        tmpSet.retainAll(set2);
        
        symDiffSet.removeAll(tmpSet);
        
        System.out.println("Symmetric Difference of the two sets : " + symDiffSet);
    }
    
}
