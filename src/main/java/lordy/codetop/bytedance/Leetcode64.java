package lordy.codetop.bytedance;

public class Leetcode64 {

    public int minPathSum(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for(int i = m; i > 1; i--){
            dp[i][0] = Integer.MAX_VALUE;
        }

        for(int i = n; i > 1; i--){
            dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }

        return dp[m][n];
    }
}
