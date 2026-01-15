/*An e-commerce company wants to display product prices in ascending order.
 Implement Quick Sort to sort the product prices.
 */

import java.util.*;

 public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[5];
        System.out.println("Enter 5 product prices: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted product prices: ");

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

/*Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case (Already Sorted): O(n²) (Can be improved using randomized pivot)
Space Complexity: O(log n) (Recursive calls)
 */