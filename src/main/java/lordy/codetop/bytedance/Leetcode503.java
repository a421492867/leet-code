package lordy.codetop.bytedance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode503 {

    public int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 2 * n ; i++){
            int j = i % n;
            while(!stack.isEmpty() && nums[j] > nums[stack.peek()]){
                res[stack.pop()] = nums[j];
            }
            stack.push(j);


        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        Leetcode503 l = new Leetcode503();
        l.nextGreaterElements(nums);
    }
}
