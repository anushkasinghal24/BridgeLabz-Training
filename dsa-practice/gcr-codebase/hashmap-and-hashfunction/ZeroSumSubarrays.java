/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
 */
import java.util.*;
public class ZeroSumSubarrays{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Take array Size input 
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        //Take array elements input 
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();

        }

        findZeroSumSubarray(arr);
    }

    //Method to find all subarrays with zero sum 
    public static void findZeroSumSubarray(int[] arr){
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;
        map.put(0, new ArrayList<>( Arrays.asList(-1)));
        System.out.println("\n Zero Sum subarrays Are : ");

        //Traverse Array
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];

            // If sum already exists in map
            if (map.containsKey(sum)) {

                // Get all previous indices where this sum occurred
                List<Integer> list = map.get(sum);

                for (int startIndex  : list) {
                    // Print subarray from startIndex+1 to i
                    printSubarray(arr, startIndex + 1, i);
                }
            }

            //Add current index to map
            map.putIfAbsent( sum , new ArrayList<>());
            map.get(sum).add(i);




        }


    }

    public static void printSubarray(int[] arr, int start, int end){
        System.out.print("[ ");
        for(int i  = start; i<= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

}