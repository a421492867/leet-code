package lordy.codetop.wangyi;

public class Leetcode121 {

    public int maxProfit(int[] prices){
        int n = prices.length;
        if(n <= 1) return 0;

        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            min = Math.min(prices[i], min);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
