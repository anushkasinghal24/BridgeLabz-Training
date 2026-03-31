/*Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
 */
import java.util.*;
public class InvertAMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> originalMap = new HashMap<>();
        System.out.print("Enter number of entries : ");

        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key : ");
            String key = sc.nextLine();
            System.out.print("Enter value : ") ;
            int value = sc.nextInt();
            sc.nextLine(); // Consume newline
            originalMap.put(key, value);
        }

        Map<Integer, String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()){
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Inverted Map: " + invertedMap);
    }}