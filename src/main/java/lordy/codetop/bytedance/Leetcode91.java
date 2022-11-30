package lordy.codetop.bytedance;

public class Leetcode91 {

    public int numDecodings(String s){
        int n = s.length();
        if(n == 0) return 0;
        if(s.charAt(0) == '0') return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            dp[i + 1] = s.charAt(i) == '0' ? 0 : dp[i];
            if(i > 0 && (s.charAt(i - 1) == 1 || (s.charAt(i - 1) =='6' && s.charAt(i) <= '6'))){
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[n];
    }
}
