package lordy.dynamicprogramming.exercise;

import java.util.Arrays;

/**
 * No.213
 */
public class Rob2 {

    public static int rob(int[] nums){
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] nums1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] nums2 = Arrays.copyOfRange(nums, 1, n);
        int[] dp1 = new int[n], dp2 = new int[n];
        dp1[1] = nums1[0]; dp2[1] = nums2[0];
        for(int i = 2; i < n; i++){
            dp1[i] = Math.max(dp1[i - 2] + nums1[i - 1], dp1[i - 1]);
            dp2[i] = Math.max(dp2[i - 2] + nums2[i - 1], dp2[i - 1]);
        }
        return Math.max(dp1[n - 1], dp2[n - 1]);
    }





    public static void main(String[] args) {

        int[] nums = {1,2,3, 1};
        System.out.println(rob(nums));
    }
}
