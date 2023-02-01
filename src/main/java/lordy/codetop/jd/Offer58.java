package lordy.codetop.jd;

import java.util.Stack;

public class Offer58 {

    public String reverseWords(String s){
        Stack<String> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(sb.length() != 0){
                    stack.push(sb.toString());
                    sb = new StringBuilder();
                }
            }else {
                sb.append(s.charAt(i));
            }
        }

        if(sb.length() != 0){
            stack.push(sb.toString());
        }

        sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop() + " ");
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
