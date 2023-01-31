package lordy.codetop.tx;

public class Leetcode152 {

    public int maxProduct(int[] nums){

        int n = nums.length;
        int min = 1, max = 1;
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                int temp = min;
                min = max;
                max = temp;
            }

            max = Math.max(nums[i] * max, nums[i]);
            min = Math.min(nums[i] * min, nums[i]);

            res = Math.max(res, max);
        }

        return res;
    }
}
