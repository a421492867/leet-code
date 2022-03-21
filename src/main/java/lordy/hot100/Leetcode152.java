package lordy.hot100;

public class Leetcode152 {

    public int maxProduct(int[] nums){
        int n = nums.length;
        int iMin = 1, iMax = 1;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                int temp = iMin;
                iMin = iMax;
                iMax = temp;
            }
            iMax = Math.max(nums[i] * iMax, nums[i]);
            iMin = Math.min(nums[i] * iMin, nums[i]);
            res = Math.max(res, iMax);
        }
        return res;
    }
}
