package lordy.exercise;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class Leetcode905 {

    public int[] sortArrayByParity(int[] nums){
        int n = nums.length;
        if(n == 1) return nums;
        int l = 0, r = n - 1;
        while(l < r){
            if(nums[l] % 2 == 0){
                l++;
            }else {
                while (l < r && nums[r] % 2 != 0){
                    r--;
                }
                swap(nums, l, r);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
