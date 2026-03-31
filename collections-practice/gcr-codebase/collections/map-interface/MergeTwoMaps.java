/*Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
 */
import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>() ;

        System.out.print("Enter number of entries for Map 1: ");
        int n1 = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter key for Map 1 : ");
            String key = sc.nextLine();
            System.out.print("Enter value for Map 1 : ");
            int value = sc.nextInt();
            sc.nextLine(); // Consume newline
            map1.put(key, value);
        }

        System.out.print("Enter number of entries for Map 2 : ");
        int n2 = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter key for Map 2 : ");
            String key = sc.nextLine();
            System.out.print("Enter value for Map 2 : ");
            int value = sc.nextInt();
            sc.nextLine(); // Consume newline
            map2.put(key, value);
        }

        // Merging maps
        Map<String, Integer> mergedMap = new HashMap<>(map1) ;
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        System.out.println("Merged Map: " + mergedMap);
    }
    
}
