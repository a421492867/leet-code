package lordy.hot100;

import java.util.PriorityQueue;
import java.util.Queue;


public class Leetcode239 {

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        Queue<Integer> queue = new PriorityQueue<Integer>(((o1, o2) -> nums[o2] - nums[o1]));
        int[] res = new int[n - k + 1];
        for(int i = 0; i < n; i++){
            queue.offer(i);
            if (!queue.isEmpty()){
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

    public static void main(String[] args) {
        Leetcode239 l = new Leetcode239();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        l.maxSlidingWindow(nums, 3);
    }

//    public int[] maxSlidingWindow(int[] nums, int k){
//        int n = nums.length;
//        int[] res = new int[n - k + 1];
//        int pre = 0, cur = k;
//        while (cur <= n){
//            findMax(res, nums, pre, cur);
//            pre++;
//            cur++;
//        }
//        return res;
//    }
//
//    public void findMax(int[] res, int[] nums, int pre, int end){
//        int max = Integer.MIN_VALUE;
//        for(int i = pre; i < end; i++){
//            max = Math.max(nums[i], max);
//        }
//        res[pre] = max;
//    }
}
