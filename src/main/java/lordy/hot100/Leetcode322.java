package lordy.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode322 {

//    public int changeCoin(int[] coins, int amount){
//        List<List<Integer>> res = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        dfs(coins, amount, list, res);
//        int min = Integer.MAX_VALUE;
//        for(List<Integer> l : res){
//            min = Math.min(l.size(), min);
//        }
//        return min == Integer.MAX_VALUE ? -1 : min;
//    }
//
//    public void dfs(int[] coins, int amount, List<Integer> list, List<List<Integer>> res){
//        if(amount == 0){
//            res.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i = 0; i < coins.length; i++){
//            if(coins[i] <= amount){
//                list.add(coins[i]);
//                dfs(coins, amount - coins[i], list, res);
//                list.remove(list.size() - 1);
//            }
//        }
//    }


    public int changeCoin(int[] coins, int amount){
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        Leetcode322 l = new Leetcode322();
        l.changeCoin(coins, amount);
    }
}
