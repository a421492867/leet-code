package lordy.exercise;

import java.util.Arrays;

public class Leetcode581 {

    public int findUnsortedSubarray(int[] nums){
        int n = nums.length;

        int l = -1, r = -1;
        int minR = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > minR){
                l = i;
            }
            minR = Math.min(minR, nums[i]);
        }

        int maxL = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] < maxL){
                r = i;
            }
            maxL = Math.max(nums[i], maxL);
        }

        return l == -1 ? 0 : r - l + 1;

    }


}
