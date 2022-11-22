package lordy.codetop.bytedance;

import java.util.Stack;

public class Leetcode32 {

    public int longestValidParentheses(String s){

        int n = s.length();

        int res = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                res = Math.max(res, i - stack.peek());
            }
        }
        return res;
    }
}
