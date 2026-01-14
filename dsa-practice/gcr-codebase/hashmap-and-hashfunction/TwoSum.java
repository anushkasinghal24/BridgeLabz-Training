/*Two Sum Problem
Problem: Given an array and a target sum, find two indices such that their values add up to the target.
Hint: Use a hash map to store the index of each element as you iterate. Check if target - current_element exists in the map.
 */
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums , int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1 }; // Return -1, -1 if no pair found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        //Take array elements input     
        System.out.println(" Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(" Enter the target sum : ");
        int targetSum = sc.nextInt();

        int[] result = twoSum(arr, targetSum);
        if(result[0] != -1){
            System.out.println("Indices of the two numbers that add up to " + targetSum + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target sum.") ;
        }
    }
    
}
