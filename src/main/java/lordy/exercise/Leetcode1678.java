package lordy.exercise;

import java.util.Stack;

public class Leetcode1678 {

    public String interpret(String command) {
        char[] array = command.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : array){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.peek() != '('){
                    sb.append("al");
                }else{
                    sb.append("o");
                }
                stack.clear();
            }else {
                if(stack.isEmpty()){
                    sb.append(c);
                }else {
                    stack.push(c);
                }
            }
        }
        return sb.toString();

    }
}
