package lordy.codetop.jd;

public class Leetcode121 {

    public int maxProfit(int[] prices){
        int n = prices.length;

        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }

        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
