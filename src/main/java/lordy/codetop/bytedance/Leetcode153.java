package lordy.codetop.bytedance;

public class Leetcode153 {

    public int findMin(int[] nums){
        int n = nums.length;

        int l = 0, r = n - 1;
        while (l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] < nums[r]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
