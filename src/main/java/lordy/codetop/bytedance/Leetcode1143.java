package lordy.codetop.bytedance;

public class Leetcode1143 {

    public int longestCommonSubsequence(String s1, String s2){
        int n = s1.length(), m = s2.length();
        if(s1.contains(s2)) return m;
        if(s2.contains(s1)) return n;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
            }
        }
        return dp[n][m];
    }
}
