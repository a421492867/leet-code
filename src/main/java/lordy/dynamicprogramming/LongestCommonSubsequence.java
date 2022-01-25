package lordy.dynamicprogramming;

/**
 * No.1143
 */
public class LongestCommonSubsequence {

    public static int subsequence(String text1, String text2){
        if(text1.contains(text2)){
            return text2.length();
        }
        if(text2.contains(text1)){
            return text1.length();
        }
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
            }
        }
        return dp[m][n];
    }


    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(subsequence(s1, s2));
    }
}
