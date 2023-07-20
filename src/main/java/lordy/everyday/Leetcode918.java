package lordy.everyday;

public class Leetcode918 {

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        leftMax[0] = nums[0];
        int leftSum = nums[0];
        int pre = nums[0];
        int res = nums[0];
        for(int i = 1; i < n; i++){
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
            leftSum += nums[i];
            leftMax[i] = Math.max(leftMax[i - 1], leftSum);
        }

        int rightSum = 0;
        for(int i = n - 1; i > 0; i--){
            rightSum += nums[i];
            res = Math.max(res, rightSum + leftMax[i - 1]);
        }
        return res;
    }
}
