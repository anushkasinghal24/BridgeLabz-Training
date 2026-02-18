import java.util.*;
public class MaximumProduct {


    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                        nums[0] * nums[1] * nums[n - 1]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MaximumProduct mp = new MaximumProduct();
        int result = mp.maximumProduct(nums);
        System.out.println("The maximum product of three numbers in the array is : " + result);
    }
}