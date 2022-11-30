package lordy.codetop.bytedance;

import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode239 {

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        Queue<Integer> queue = new PriorityQueue<>(((o1, o2) -> nums[o2] - nums[o1]));
        int[] res = new int[n - k + 1];
        for(int i = 0; i < n; i++){
            queue.offer(i);
            if(!queue.isEmpty()){
                while (queue.peek() <= i - k){
                    queue.poll();
                }
            }
            if(i >= k - 1){
                res[i - k + 1] = nums[queue.peek()];
            }
        }
        return res;
    }
}
