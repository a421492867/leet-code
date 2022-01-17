package lordy.dynamicprogramming;

import java.util.Arrays;

/**
 * No.279
 * dp[i] = 1 + min(dp[i-1],dp[i-4],dp[i-9]...)
 */
public class PerfectSquares {

    public static int numSquares(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j * j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i - j * j] +1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
