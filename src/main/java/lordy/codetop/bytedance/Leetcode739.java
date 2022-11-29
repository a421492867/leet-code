package lordy.codetop.bytedance;

import java.util.Stack;

public class Leetcode739 {

    public int[] dailyTemperatures(int[] temperatures){
        int n = temperatures.length;

        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
