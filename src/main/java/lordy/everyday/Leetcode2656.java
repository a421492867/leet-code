package lordy.everyday;

import java.util.Arrays;

public class Leetcode2656 {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            max = Math.max(max, nums[i]);
        }
        int last = max + k - 1;
        int res = (max + last) * k / 2;
        return res;
    }


}
