package lordy.exercise;

public class Leetcode334 {

    public boolean increasingTriplet(int[] nums){
        int n = nums.length;

        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > mid) return true;
            if(nums[i] <= min) min  = nums[i];
            else mid = nums[i];
        }
        return false;
    }
}
