package lordy.codetop.bytedance;

public class Leetcode11 {

    public int maxArea(int[] height){
        int n = height.length;
        int res = Integer.MIN_VALUE;
        int l = 0, r = n - 1;
        while (l < r){
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
