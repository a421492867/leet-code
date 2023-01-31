package lordy.codetop.tx;

import java.util.Arrays;

public class Leetcode724 {

    public int pivotIndex(int[] nums){
        int sum = Arrays.stream(nums).sum();
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if(pre == sum - nums[i] - pre){
                return i;
            }
            pre += nums[i];
        }
        return -1;
    }
}
