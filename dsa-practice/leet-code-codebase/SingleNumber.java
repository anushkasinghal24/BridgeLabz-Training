/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1 */
import java.util.Scanner;

class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter elements:") ;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object and find single number
        SingleNumber obj = new SingleNumber();
        int result =  obj.singleNumber(nums);

        // Output
        System.out.println(" Single Number is: " + result);

        sc.close();
    }
}