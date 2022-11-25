package lordy.codetop.bytedance;

public class Leetcode162 {

    public int findPeakElement(int[] nums){
        int n = nums.length;
        if(n == 1) return 0;
        int l = 0, r = n - 1, mid;
        while (l < r){
            mid = l + (r - l) / 2;
            if(mid == 0 || nums[mid - 1] < nums[mid]){
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        return l;
    }

    // n = nums.length;
    //l = 0,  r = n;
    //while(l < r)
    // l = mid + 1;
    // r = mid;
}
