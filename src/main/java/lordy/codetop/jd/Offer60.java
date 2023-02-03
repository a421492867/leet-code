package lordy.codetop.jd;

import java.util.Arrays;

public class Offer60 {

    public double[] dicesProbability(int n){
        //dp[i][j]表示前i个骰子点数和为j的概率  由于只需要最后状态的数组 所以只用一维数组dp[j]即可
        //初始化1个骰子的情况下
        double[] dp = new double[6];
        Arrays.fill(dp, 1 / 6.0);

        //从第2个骰子开始 逐步求3 4 ... n 的情况
        for(int i = 2; i <= n; i++){
            //此时  点数之和 最大 6 * i  最小为 i   所以 点数之和的总个数为 6 * i - (i - 1) 即 5 * i + 1个
            double[] temp = new double[5 * i + 1];

            // 从 i - i 个点数之和值入手  计算i个骰子点数之和数组的值
            for(int j = 0; j < dp.length; j++){
                for(int k = 0; k < 6; k++){
                    temp[j + k] += dp[j] * (1 / 6.0);
                }
            }

            dp = temp;
        }

        return dp;
    }
}
