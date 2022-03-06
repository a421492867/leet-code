package lordy.hot100;

/**
 * 可多次买多次卖
 */
public class Leetcode122 {

    public int maxProfit(int[] prices){
        int max = 0;
        for(int i = 0; i < prices.length - 1; i ++){
            if(prices[i] < prices[i + 1]){
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }
}
