
import java.util.*;
class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int targetIdx = ((i + nums[i]) % n + n) % n;
            result[i] = nums[targetIdx];
        }

        return result;
    }
    public static void main(String[] args) {
        TransformedArray ta = new TransformedArray();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] transformed = ta.constructTransformedArray(nums);     
        System.out.println(Arrays.toString(transformed)); // Output: [0, 1, 5, 4, 2, 3]


        

    }
}