package lordy.structure.stackandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * No.20
 */
public class ValidParentheses {

    public static boolean isValid(String s){
        if(s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(int i = 0; i < s.length(); i++){
            Character character = s.charAt(i);
            if(map.containsKey(character)){
                if(stack.isEmpty() || stack.peek() != map.get(character)){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                stack.push(character);
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
