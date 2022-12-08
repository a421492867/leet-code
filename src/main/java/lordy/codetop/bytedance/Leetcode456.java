package lordy.codetop.bytedance;


import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode456 {

    public boolean find132Pattern(int[] nums){
        int n = nums.length;

        Deque<Integer> deque = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;

        for(int i = n - 1; i >= 0; i--){
            if(nums[i] < k) return true;

            while (!deque.isEmpty() && deque.peekLast() < nums[i]){
                k = deque.pollLast();
            }
            deque.addLast(nums[i]);
        }
        return false;
    }
}
