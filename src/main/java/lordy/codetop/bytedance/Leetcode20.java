package lordy.codetop.bytedance;

import java.util.Stack;

public class Leetcode20 {

    public boolean isValid(String s){
        int n = s.length();
        if(n % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                if(c == ')' && stack.peek() != '(') return false;
                if(c == '}' && stack.peek() != '{') return false;
                if(c == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}
