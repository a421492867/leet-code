package lordy.codetop.wangyi;

import java.util.Arrays;

public class Leetcode41 {

    public int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        int res = 1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == res){
                res++;
            }
        }
        return res;
    }
}
