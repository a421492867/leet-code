package lordy.hot100;

import java.util.Stack;

public class Leetcode151 {

    public String reverseWords(String s) {
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
        String result = sb.toString();
        return result.substring(0, result.length() - 1);


    }


    public static void main(String[] args) {
        Leetcode151 l = new Leetcode151();
        String s = "the sky is blue";
        System.out.println(l.reverseWords(s));
    }
}
