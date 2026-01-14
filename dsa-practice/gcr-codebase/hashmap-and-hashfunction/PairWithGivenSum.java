/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.*/
import java.util.*;
public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take array Size input 
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        //Take array elements input 
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the target sum : ");
        int targetSum = sc.nextInt();

        findPairsWithGivenSum(arr, targetSum);
    }

    //Method to find all pairs with given sum 
    public static void findPairsWithGivenSum(int[] arr, int targetSum){
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        System.out.println("\n Pairs with sum " + targetSum + " are : ");

        for(int num : arr){
            int complement = targetSum - num;
            if(set.contains(complement)){
                System.out.println("(" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }
    
}
