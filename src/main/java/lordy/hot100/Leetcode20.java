package lordy.hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode20 {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        int n = s.length();
        if(n % 2 == 1) return false;
        for(int i = 0; i < n; i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
