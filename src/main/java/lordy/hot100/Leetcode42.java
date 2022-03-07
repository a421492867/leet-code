package lordy.hot100;

public class Leetcode42 {

    public int trap(int[] height){
        int n = height.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while (left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax <= rightMax){
                res += leftMax - height[left];
                left++;
            }else {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode42 l = new Leetcode42();
        int[] height = {4,2,0,3,2,5};
        System.out.println(l.trap(height));
    }
}
