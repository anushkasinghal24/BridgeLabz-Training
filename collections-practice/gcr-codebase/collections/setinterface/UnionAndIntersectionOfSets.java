/*Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}. */
import java.util.*;
public class UnionAndIntersectionOfSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input sets 
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.println("Enter number of elements in first set:");
        int n1 = sc.nextInt() ;
        System.out.println("Enter elements of first set :"); 

        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter number of elements in second set :");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second set :");
        for(int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
        }
        //Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of the two sets : " + unionSet);
        //Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1); 
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of the two sets : " + intersectionSet);
        
    }
    
}
