package lordy.codetop.jd;

public class Leetcode42 {

    public int trap(int[] height){
        int n = height.length;
        int[] left = new int[n], right = new int[n];
        left[0] = height[0]; right[n - 1] = height[n - 1];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i - 1], height[i]);
            right[n - 1 - i] = Math.max(right[n - i], height[n - 1 - i]);
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}
