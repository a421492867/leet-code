package lordy.hot100;

/**
 * 超出时间限制
 */
public class Leetcode239 {

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int pre = 0, cur = k;
        while (cur <= n){
            findMax(res, nums, pre, cur);
            pre++;
            cur++;
        }
        return res;
    }

    public void findMax(int[] res, int[] nums, int pre, int end){
        int max = Integer.MIN_VALUE;
        for(int i = pre; i < end; i++){
            max = Math.max(nums[i], max);
        }
        res[pre] = max;
    }
}
