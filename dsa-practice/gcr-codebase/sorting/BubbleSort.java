/*Problem Statement:
A school maintains student marks in an array. 
Implement Bubble Sort to sort the student marks in ascending order. */
import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 student marks: ");
        for(int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


/*Time Complexity:
Best Case (Already Sorted): O(n)
Average Case: O(n²)
Worst Case (Reverse Sorted): O(n²)
Space Complexity: O(1) (In-place Sorting) */
