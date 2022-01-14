package lordy.dynamicprogramming;

import java.util.Arrays;

/**
 * No.70
 * arr[i] 表示走到第i阶的方法数
 * 因为我们每次可以走一步或者两步  所以第i阶可以从 第 i - 1 或 i - 2阶到达
 * 换句话说 走到第 i 阶的方法数即为走到第 i - 1阶的方法数 加上 走到第 i - 2阶的方法数
 * 状态转移方程为 arr[i] = arr[i - 1] + arr[i - 2]
 */
public class ClimbingStairs {

    public static int climbStairs(int n){
        if(n <= 2) return n;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);
        for(int i = 2; i < n + 1; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
