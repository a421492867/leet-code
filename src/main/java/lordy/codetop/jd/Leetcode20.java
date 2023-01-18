package lordy.codetop.jd;

import java.util.Stack;

public class Leetcode20 {

    public boolean isValid(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;

        if(n % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = chars[i];
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                if(c == ')' && stack.peek() != '(') return false;
                if(c == '}' && stack.peek() != '{') return false;
                if(c == ']' && stack.peek() != '[') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
