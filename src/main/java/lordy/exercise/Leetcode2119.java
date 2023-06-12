package lordy.exercise;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode2119 {

    public boolean isSameAfterReversals(int num){
        if(num == 0) return true;
        String s = String.valueOf(num);
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : array){
            stack.push(c);
        }

        while (!stack.isEmpty() && stack.peek() == '0'){
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String reversed = sb.reverse().toString();
        return s.equals(reversed);

    }
}
