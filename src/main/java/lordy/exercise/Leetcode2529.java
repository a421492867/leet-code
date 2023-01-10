package lordy.exercise;

public class Leetcode2529 {

    public int maximumCount(int[] nums){
        int pos = 0, neg = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) neg++;
            if(nums[i] > 0) pos++;
        }
        return Math.max(pos, neg);
    }
}
