package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode322 {

    public int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        int n = coins.length;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < n; j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
