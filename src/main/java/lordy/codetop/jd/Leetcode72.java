package lordy.codetop.jd;

public class Leetcode72 {

    public int minDistance(String word1, String word2){
        int n = word1.length(), m = word2.length();
        if(n * m == 0) return n + m;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; i <= n; i++){
            dp[i][0] = i;
        }
        for(int i = 0; i <= m; i++){
            dp[0][i] = i;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                int l = dp[i - 1][j] + 1;
                int d = dp[i][j - 1] + 1;
                int ld = dp[i - 1][j - 1];
                if(word1.charAt(i - 1) != word2.charAt(j - 1)){
                    ld += 1;
                }
                dp[i][j] = Math.min(ld, Math.min(l, d));
            }
        }
        return dp[n][m];
    }
}
