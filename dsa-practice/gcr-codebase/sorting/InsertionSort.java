/*Problem Statement:
A company stores employee IDs in an unsorted array. 
Implement Insertion Sort to sort the employee IDs in ascending order. */

import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 employee IDs: ");
        for(int i = 0 ; i< 5 ; i++){
            arr[i]  = sc.nextInt();

            
        }
        
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



/*Time Complexity:
Best Case (Already Sorted): O(n)
Average Case: O(n²)
Worst Case (Reverse Sorted): O(n²)
Space Complexity: O(1) (In-place Sorting) */