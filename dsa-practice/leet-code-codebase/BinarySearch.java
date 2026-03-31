/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4 */
import java.util.Scanner;

class BinarySearch {

    // Recursive Binary Search
    int binary(int[] nums, int target, int i, int j) {
        if (i <= j) {
            int mid = i + (j - i)  / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)

                return binary(nums, target, mid + 1, j);


            else
                return binary(nums, target, i, mid - 1);
        }
        return -1;
    }

    public int search(int[] nums, int target){
        return binary(nums, target, 0, nums.length - 1);
    }

    // Main method for user input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements :");
        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        BinarySearch obj = new BinarySearch();

        int result = obj.search(nums, target);

        if (result != -1)
            System.out.println("Element found at index : " + result);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
