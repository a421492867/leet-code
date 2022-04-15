package lordy.exercise;

public class Leetcode154 {

    public int findMin(int[] nums){
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r){
            int mid = l + r >> 1;
            if(nums[mid] < nums[r]){
                r = mid;
            }else if(nums[mid] > nums[r]){
                l = mid + 1;
            }else {
                r -= 1;
            }
        }
        return nums[r];
    }
}
