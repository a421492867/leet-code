package lordy.codetop.jd;

import java.util.Stack;

public class Leetcode1047 {

    public String removeDuplicates(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = chars[i];
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
