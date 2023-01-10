package lordy.exercise;

import java.util.PriorityQueue;

public class Leetcode2530 {

    public long maxKElements(int[] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        for(int num : nums){
            queue.offer(num);
        }

        long ans = 0;
        while (k > 0){
            int num = queue.poll();
            ans += num;
            queue.offer(ceil(num));
            k--;
        }
        return ans;
    }

    private int ceil(int n){
        return n % 3 == 0 ? n / 3 : n / 3 + 1;
    }

    public static void main(String[] args) {
        Leetcode2530 l = new Leetcode2530();
        int[] nums = {1,10,3,3,3};
        int k = 3;
        l.maxKElements(nums, k);
    }
}
