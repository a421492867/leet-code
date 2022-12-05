package lordy.codetop.bytedance;

public class Offer46 {

    public int translateNum(int num){
        char[] chars = String.valueOf(num).toCharArray();
        int n = chars.length;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            if(i == 0) {
                dp[i + 1] = 1;
            }else{
                if(chars[i - 1] == '1' || (chars[i - 1] == '2' && chars[i] <= '5')){
                    dp[i + 1] = dp[i] + dp[i - 1];
                }else{
                    dp[i + 1] = dp[i];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Offer46 l = new Offer46();
        System.out.println(l.translateNum(12258));
    }
}
