package lordy.codetop.bytedance;

import java.util.Stack;

public class Leetcode402 {

    public String removeKdigits(String num, int k){
        Stack<Character> stack = new Stack<>();
        int n = num.length();
        for(int i = 0; i < n; i++){
            char digit = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String s = sb.reverse().toString();
        while (s.length() > 0 && s.startsWith("0")){
            s = s.substring(1);
        }
        return s.length() == 0 ? "0" : s;
    }
}
