package lordy.everyday;

import java.util.Arrays;

public class Leetcode2679 {

    public int matrixSum(int[][] nums) {
        int n = nums.length, length = nums[0].length;
        for(int i = 0; i < n; i++){
            Arrays.sort(nums[i]);
        }
        int cur = length - 1;
        int res = 0;
        while (cur >= 0){
            int temp = 0;
            for(int i = 0; i < n; i++){
                temp = Math.max(nums[i][cur], temp);
            }
            res += temp;
            cur--;
        }
        return res;
    }
}
