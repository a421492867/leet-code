package lordy.codetop.bytedance;

public class Leetcode209 {

    public int minSubArrayLen(int target, int[] nums){
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int curTarget = 0;
        while (r < n){
            int num = nums[r];
            curTarget += num;
            if(curTarget >= target){
                while(curTarget - nums[l] >= target){
                    curTarget -= nums[l];
                    l++;
                }
                res = Math.min(res, r - l + 1);
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }


    public static void main(String[] args) {
        Leetcode209 l = new Leetcode209();
        l.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }
}
