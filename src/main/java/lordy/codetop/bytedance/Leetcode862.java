package lordy.codetop.bytedance;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Leetcode862 {

    public int shortestSubarray(int[] nums, int k){
        int n = nums.length;

        long[] pre = new long[n + 1];
        for(int i = 0; i < n; i++){
            pre[i + 1] = pre[i] + nums[i];
        }
        Deque<Integer> queue = new ArrayDeque<>();
        int res = Integer.MAX_VALUE;
         for(int i = 0; i <= n; i++){
             long curSum = pre[i];
             while (!queue.isEmpty() && curSum - pre[queue.peekFirst()] >= k){
                 res = Math.min(res, i - queue.pollFirst());
             }
             while (!queue.isEmpty() && pre[queue.peekLast()] >= curSum){
                 queue.pollLast();
             }
             queue.offerLast(i);
        }
         return res == Integer.MAX_VALUE ? -1: res;
    }


    public static void main(String[] args) {
        Leetcode862 l = new Leetcode862();
        int s = l.shortestSubarray(new int[]{84,-37,32,40,95}, 167);
        System.out.println(s);
    }
}
