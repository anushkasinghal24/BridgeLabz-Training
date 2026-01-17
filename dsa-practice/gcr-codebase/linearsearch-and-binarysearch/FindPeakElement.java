//Binary Search Algo
/*A peak element is an element that is greater than its neighbors. 
Write a program that performs Binary Search to find a peak element in an array. 
If there are multiple peak elements, return any one of them. */

import java.util.*;

public class FindPeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 0, right  = n - 1;

        while (left <= right){
            int mid = left + (right - left) / 2 ;

            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1] );

            // Check if mid is peak
            if (leftOk && rightOk){
                return mid;
            }

            // Move to left half
            if (mid > 0 && arr[mid] < arr[mid - 1]){
                right = mid - 1;
            }
            // Move to right half
            else {
                left = mid + 1;
            }
        }

        return -1; // Should never reach here for valid input
    }

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeakElement(arr) ;
        System.out.println(" Peak element: " + arr[peakIndex]);
        System.out.println(" Peak index: " + peakIndex);
    }
}
