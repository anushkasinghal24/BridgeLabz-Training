/*Longest Consecutive Sequence
Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
Hint: Use a hash map to store elements and check for consecutive elements efficiently.
 */
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Take array elements input     
        System.out.println("Enter Array Elements : ") ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int result = longestConsecutive(arr);
        System.out.println("Length of Longest Consecutive Sequence: " + result);
        
    }

    public static int longestConsecutive(int[] arr){
        if(arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int longestStreak = 0;

        for(int num : arr){
            if(!set.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max( longestStreak, currentStreak);
            }
        }

        return longestStreak;

    }
    
}
