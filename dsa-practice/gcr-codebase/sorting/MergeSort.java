//Merge Sort(Divide and Conquer algorithm)

/*Problem Statement:
A bookstore maintains a list of book prices in an array.
Implement Merge Sort to sort the prices in ascending order. */
import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right){
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

private static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 book Prices : ");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}


/*Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)
Space Complexity: O(n) (Uses extra space for merging)
 */