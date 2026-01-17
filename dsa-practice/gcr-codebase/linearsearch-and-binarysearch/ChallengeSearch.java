/*You are given a list of integers. 
Write a program that uses Linear Search to find the first missing positive integer in the list and 
Binary Search to find the index of a given target number. */
//Challenge Problem (for both Linear and Binary Search)

import java.util.*;

public class ChallengeSearch {

    // -------- Linear Search: First Missing Positive --------
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }

        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }


        }
        return n + 1;

    }

    //  Binary Search: Find Target Index 
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return mid;
                
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left =  mid + 1;
            }
        }
        return -1;
    }

    // -------- Main Method --------
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search Result
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer : " + missing);

        // Binary Search Preparation
        Arrays.sort(arr);
        System.out.print(" Enter target to search : ");
        int target = sc.nextInt();

        int index =binarySearch(arr, target);
        System.out.println("Target Index (after sorting) : " + index);
    }
}
