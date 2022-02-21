package lordy.structure.stackandqueue;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * No.239
 */
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindowQueue(int nums[], int k){

        LinkedList<Integer> queue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        for(int i = 0; i < nums.length; i++){
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);

            if(queue.peek() <= i - k){
                queue.poll();
            }
            if(i + 1 >= k){
                result[i + 1 - k] = nums[queue.peek()];
            }
        }
        return result;
    }

    public static int[] maxSlidingWindow(int nums[], int k){
        int length = nums.length;
        int[] res = new int[length - k + 1];

        int pre = 0, cur = k;
        while (cur <= length){
            max(res, nums, pre, cur);
            pre++;
            cur++;
        }

        return res;
    }

    public static void max(int[] res, int nums[], int pre, int cur){
        int max = Integer.MIN_VALUE;
        for(int i = pre; i < cur; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        res[pre] = max;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(JSON.toJSONString(maxSlidingWindowQueue(nums, k)));
    }
}
