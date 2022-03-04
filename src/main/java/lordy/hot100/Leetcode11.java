package lordy.hot100;

public class Leetcode11 {

    public static int maxArea(int[] height){
        int n = height.length;
        int res = Integer.MIN_VALUE;
        int pre = 0, last = n - 1;
        while (pre < last){
            res = Math.max(Math.min(height[pre], height[last]) * (last - pre), res);
            if(height[pre] < height[last]){
                pre++;
            }else {
                last--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
