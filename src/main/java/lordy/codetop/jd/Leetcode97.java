package lordy.codetop.jd;

public class Leetcode97 {

    public boolean isInterleave(String s1, String s2, String s3){
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        if(n1 + n2 != n3) return false;

        boolean[][] dp = new boolean[n1 + 1][n2 + 1];
        dp[0][0] = true;

        for(int i = 0; i <= n1; i++){
            for(int j = 0; j <= n2; j++){
                if(i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1) && dp[i - 1][j]){
                    dp[i][j] = true;
                }else if(j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1) && dp[i][j - 1]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n1][n2];
    }
}
