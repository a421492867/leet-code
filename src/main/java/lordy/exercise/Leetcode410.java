package lordy.exercise;

import java.util.Arrays;

public class Leetcode410 {

    public int splitArray(int[] nums, int m){
        int sum = Arrays.stream(nums).sum();
        int l = 1, r = sum;
        while(l < r){
            int mid = l + r >> 1;
            if(check(mid, nums, m - 1)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return r;
    }

    public boolean check(int mid, int[] nums, int m){
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > mid){
                return false;
            }
            res +=  nums[i];
            if(res <= mid){
                continue;
            }else{
                m--;
                res = nums[i];
            }
        }

        return m >= 0;
    }
}
