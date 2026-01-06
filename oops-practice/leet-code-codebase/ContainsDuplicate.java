import java.util.Arrays;
public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        boolean result = obj.containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + result);
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}