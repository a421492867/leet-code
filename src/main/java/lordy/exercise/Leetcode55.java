package lordy.exercise;

public class Leetcode55 {

    public boolean canJump(int[] nums){
        int n = nums.length;
        int r = 0;
        for(int i = 0; i < n; i++){
            if(i <= r){
                r = Math.max(r, nums[i] + i);
            }
            if(r >= n - 1){
                return true;
            }
        }
        return false;
    }
}
