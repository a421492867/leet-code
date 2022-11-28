package lordy.exercise;

public class Leetcode983 {

    public int mincostTickets(int[] days, int[] costs){
        int n = days.length;
        int maxD = days[n - 1];
        int[] dp = new int[maxD + 31];
        dp[0] = 0;
        for(int i = 1, d = 0; i < dp.length; i++){
            int x = 0;
            if(d < n && i == days[d]){
                x = dp[i - 1] + costs[0];
                d++;
            }else {
                x = dp[i - 1];
            }
            int y = (i > 7 ? dp[i - 7] : dp[0]) + costs[1];
            int z = (i > 30 ? dp[i - 30] : dp[0]) + costs[2];
            dp[i] = Math.min(x, Math.min(y, z));
        }
        return dp[dp.length - 1];
    }
}
