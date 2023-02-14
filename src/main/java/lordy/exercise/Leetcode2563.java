package lordy.exercise;

public class Leetcode2563 {

    public long countFairPairs(int[] nums, int lower, int upper){
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[j] == nums[j - 1]) break;
                if(nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper){
                    res++;
                }
            }
        }
        return res;
    }
}
