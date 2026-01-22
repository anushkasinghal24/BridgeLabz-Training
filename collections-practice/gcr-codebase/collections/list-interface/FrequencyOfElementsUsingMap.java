/*Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
 */
import java.util.*;

public class FrequencyOfElementsUsingMap{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");

        int n = sc.nextInt();

        sc.nextLine();

        List<String> list = new ArrayList<>();

        System.out.println("Enter elements : ");
        for(int i = 0; i<n; i++){
            list.add(sc.nextLine());
        }

        Map<String, Integer> frequencyMapping = countingFrequency(list);

        System.out.println("Frequency of elements: " + frequencyMapping);

    }

    public static Map<String, Integer> countingFrequency(List<String> list){
        Map<String,Integer> freq = new HashMap<>();


        for(String str:list){
            freq.put(str,freq.getOrDefault(str,0)+1);
        }

        return freq;
    }
}