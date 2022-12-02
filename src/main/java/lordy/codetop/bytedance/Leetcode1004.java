package lordy.codetop.bytedance;

import java.util.Map;

public class Leetcode1004 {

    public int longestOnes(int[] nums, int k){

        int n = nums.length;
        int l = 0,  r = 0;
        int res = 0;
        while (r < n){
            if(nums[r] == 0) k--;
            if(k < 0){
                while(nums[l] != 0){
                    l++;
                }
                l++;
                k++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;

    }
}
