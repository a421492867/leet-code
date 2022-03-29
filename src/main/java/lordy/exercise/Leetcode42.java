package lordy.exercise;

public class Leetcode42 {

    public int trap(int[] height){
        int n = height.length;
        int l = 0, r = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while(l < r){
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if(leftMax <= rightMax){
                res += leftMax - height[l];
                l++;
            }else {
                res += rightMax - height[r];
                r--;
            }
        }
        return res;
    }
}
