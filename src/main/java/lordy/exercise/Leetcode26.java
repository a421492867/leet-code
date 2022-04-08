package lordy.exercise;

public class Leetcode26 {

    public int removeDuplicates(int[] nums){
        int slow = 1, fast = 1;
        int n = nums.length;
        if(n == 0) return 0;
        while(fast < n){
            if(nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
