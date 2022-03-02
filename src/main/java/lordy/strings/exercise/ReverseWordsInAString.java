package lordy.strings.exercise;

import java.util.Stack;

/**
 * No.151
 */
public class ReverseWordsInAString {

    public static String reverseWords(String s){
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

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop() + " ");
        }
        String result = res.toString();
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
