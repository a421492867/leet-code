package lordy.codetop.jd;

public class Leetcode268 {

    public int missingNumber(int[] nums){
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int i = 0; i < n; i++){
            sum -= nums[i];
        }
        return sum;
    }
}
