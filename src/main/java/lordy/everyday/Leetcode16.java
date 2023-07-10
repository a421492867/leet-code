package lordy.everyday;

import java.util.Arrays;
import java.util.Map;

public class Leetcode16 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int k = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < n; i++){
            int l = i + 1, r = n - 1;
            while (l < r){
                int val = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(val - target);
                if(diff < k){
                    res = val;
                    k = diff;
                }
                if(val > target){
                    r--;
                }else{
                    l++;
                }

            }
        }
        return res;
    }
}
