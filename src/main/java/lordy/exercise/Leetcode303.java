package lordy.exercise;

public class Leetcode303 {

    private int[] sum;

    public Leetcode303(int[] nums) {
        int n = nums.length;
        sum = new int[n + 1];
        for(int i = 0; i < n; i++){
            sum[i + 1] = sum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right){
        return sum[right + 1] - sum[left];
    }
}
