import java.util.*;
class JumpGame {
    public int jump(int[] nums) {
        int dp[] = new int [nums.length];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }

    public int helper(int nums[],int idx, int dp[]){
        if(idx>=nums.length-1){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ans=1000000;
        for(int i=1;i<=nums[idx];i++){
            ans = Math.min(ans,helper(nums,idx+i,dp));
        }

        return dp[idx]=ans+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter number of elements in the array : ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println(" Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        JumpGame obj = new JumpGame();
        int result = obj.jump(nums);

        System.out.println(" Minimum number of jumps to reach the last index is : " + result);
    }
}