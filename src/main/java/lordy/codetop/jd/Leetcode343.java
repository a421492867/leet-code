package lordy.codetop.jd;

public class Leetcode343 {

    public int integerBreak(int n){
        int[] dp = new int[n + 1];
        for(int i = 2; i <= n; i++){
            int cur = 0;
            for(int j = 1; j < i; j++){
                cur = Math.max(cur, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = cur;
        }
        return dp[n];
    }
}
