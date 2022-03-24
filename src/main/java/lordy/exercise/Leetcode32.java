package lordy.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode32 {

    public int longestValidParentheses(String s){
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
