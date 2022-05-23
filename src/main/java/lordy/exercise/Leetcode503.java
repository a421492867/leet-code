package lordy.exercise;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode503 {

    public int[] nextGreaterElements(int[] nums){
        int n = nums.length;

        Stack<Integer> stack = new Stack<>();

        int[] res = new int[n];
        Arrays.fill(res, -1);

        for(int i = 0; i < n * 2; i++){
            if(stack.isEmpty() || nums[stack.peek()] >= nums[i % n]){
                stack.push(i % n);
            }else{
                while(!stack.isEmpty() && nums[stack.peek()] < nums[i % n]){
                    int index = stack.pop();
                    res[index] = nums[i % n];
                }
                stack.push(i % n);
            }
        }

        return res;
    }
}
