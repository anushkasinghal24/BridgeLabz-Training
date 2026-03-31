/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */
import java.util.Scanner;

class MoveZeroes{

    public void moveZeroes(int[] nums){
        int insertPos = 0;

        //Move non-zero elements forward
        for (int i = 0; i < nums.length; i++){

            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        //  Fill remaining positions with zero
        while ( insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++ ;
        }
    }

    // Main method for user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] nums = new int[n]; 

        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MoveZeroes obj = new MoveZeroes();
        obj.moveZeroes(nums);

        System.out.println("Array after moving zeroes : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
