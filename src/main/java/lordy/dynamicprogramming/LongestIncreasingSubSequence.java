package lordy.dynamicprogramming;

import java.util.Arrays;

/**
 * No.300
 */
public class LongestIncreasingSubSequence {

    public static int lengthOfLis(int[] nums){
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 1; i < n; i++){
            int currentMax = 0;
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    currentMax = Math.max(currentMax, dp[j + 1]);
                }
            }
            dp[i + 1] = currentMax + 1;
        }

        Arrays.sort(dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLis(nums));
    }
}
