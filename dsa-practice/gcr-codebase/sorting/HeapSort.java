/*Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
 */

import java.util.*;
public class HeapSort {
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr){
        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 expected salary demands : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);
        System.out.println("Sorted salary demands: ");
        System.out.println(Arrays.toString(arr));
    }
}


/*Time Complexity:
Best Case: O(n log n)

Average Case: O(n log n)
Worst Case: O(n log n)
Space Complexity: O(1) (In-place Sorting) */
