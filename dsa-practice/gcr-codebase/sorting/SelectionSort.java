/*Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
 */

import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;

                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIdx];

            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 students' exam scores: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        
        selectionSort(arr);
        System.out.println("Sorted exam scores: ");

        System.out.println(Arrays.toString(arr));
    }
}

 /*Time Complexity:
Best Case: O(n²)
Average Case: O(n²)
Worst Case: O(n²)
Space Complexity: O(1) (In-place Sorting)



*/