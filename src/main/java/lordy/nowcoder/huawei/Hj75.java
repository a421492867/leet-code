package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            System.out.println(helper(s1, s2));
        }
    }


    public static int helper(String s1, String s2){
        int n = s1.length(), m = s2.length();
        if(s1.contains(s2)) return m;
        if(s2.contains(s1)) return n;
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(dp[i][j], max);
                }else{
                    dp[i][j] = 0;
                }

            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
