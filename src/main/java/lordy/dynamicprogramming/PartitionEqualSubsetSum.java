package lordy.dynamicprogramming;

import java.util.Arrays;

/**
 * No.416
 */
public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums){
        int total = Arrays.stream(nums).sum();
        if(total % 2 != 0) return false;
        int target = total / 2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        dp[0][0] = true;
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0; j <= target; j++){
                if(j < nums[i - 1]){
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[nums.length][target];
    }

    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
