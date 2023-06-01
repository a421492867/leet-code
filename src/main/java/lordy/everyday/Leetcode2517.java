package lordy.everyday;

import java.util.Arrays;

/**
 * 给你一个正整数数组 price ，其中 price[i] 表示第 i 类糖果的价格，另给你一个正整数 k 。
 *
 * 商店组合 k 类 不同 糖果打包成礼盒出售。礼盒的 甜蜜度 是礼盒中任意两种糖果 价格 绝对差的最小值。
 *
 * 返回礼盒的 最大 甜蜜度。
 */
public class Leetcode2517 {

    public int maximumTastiness(int[] price, int k){
        Arrays.sort(price);
        int n = price.length;
        int l = 0, r = price[n - 1] - price[0] + 1;
        while (l < r){
            // why need  +1 ?
            int mid = (l + r + 1) / 2;
            if(check(price, k, mid)){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return l;
    }

    private boolean check(int[] price, int k, int mid){
        int pre = price[0];
        int count = 0;
        int n = price.length;
        for(int i = 1; i < n; i++){
            if(price[i] - pre >= mid){
                count++;
                pre = price[i];
            }
        }
        return count >= k;
    }

    public static void main(String[] args) {
        Leetcode2517 l = new Leetcode2517();
        int[] price = {13,5,1,8,21,2};
        int k = 3;
        l.maximumTastiness(price, k);
    }
}
