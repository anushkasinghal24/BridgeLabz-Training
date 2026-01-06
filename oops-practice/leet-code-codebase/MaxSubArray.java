public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray obj = new MaxSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int total = 0;

        for (int i : nums) {
            if (total < 0) {
                total = 0;
            }
            total += i;
            ans = Math.max(ans, total);
        }
        return ans;
    }
}