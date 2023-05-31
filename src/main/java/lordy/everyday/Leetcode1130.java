package lordy.everyday;

import java.util.Arrays;

//TODO
public class Leetcode1130 {

    public int mctFromLeafValues(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        int[][] mVal = new int[n][n];

        for(int j = 0; j < n; j++){
            mVal[j][j] = arr[j];
            dp[j][j] = 0;
            for(int i = j - 1; i >=0; i--){
                mVal[i][j] = Math.max(arr[i], mVal[i + 1][j]);
                for(int k = i; k < j; k++){
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + mVal[i][k] * mVal[k + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
