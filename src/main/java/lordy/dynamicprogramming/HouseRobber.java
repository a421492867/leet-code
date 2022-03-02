package lordy.dynamicprogramming;

import java.util.Arrays;

/**
 * No.198
 */
public class HouseRobber {

    public static int rob(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);
        arr[1] = nums[0];
        for(int i = 2; i <= n; i++){
            arr[i] = Math.max(arr[i - 1], nums[i - 1] + arr[i - 2]);
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
