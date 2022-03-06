package lordy.hot100;

/**
 * 不可多次买入多次卖出
 */
public class Leetcode121 {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1){
            return 0;
        }

        int max = 0;
        int[] dp = new int[n];
        dp[0] = prices[0];
        for(int i = 1; i < n; i++){
            dp[i] = Math.min(prices[i], dp[i - 1]);
            max = Math.max(prices[i] - dp[i], max);
        }
        return max;

    }

}
