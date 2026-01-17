//Binary Search Algo
/*Given a sorted array and a target element, 
write a program that uses Binary Search to find the first and last occurrence of the target element in the array. 
If the element is not found, return -1. */

import java.util.*;

public class FirstLastOccurrence {

    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // search left
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1 ;

        while (left <= right) {
            int mid = left + ( right - left ) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // search right
            } else if (arr[mid]  > target) {
                right = mid - 1 ;
            } else {
                left = mid + 1 ;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println(" Enter sorted array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(" Enter target : ");
        int target = sc.nextInt();

        int first = findFirst(arr , target);
        int last = findLast(arr , target);

        System.out.println("First Occurrence : " + first);
        System.out.println("Last Occurrence : " + last);
    }
}
