import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numIndices = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numIndices[i][0] = nums[i]; 
            numIndices[i][1] = i;       
        }

        Arrays.sort(numIndices, (a, b) -> Integer.compare(a[0], b[0]));

        
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = numIndices[left][0] + numIndices[right][0];
            if (sum == target) {
                
                return new int[] { numIndices[left][1], numIndices[right][1] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");
        
        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");
        
       
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}