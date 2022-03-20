package lordy.exercise;

import java.util.Stack;

public class Leetcode58 {

    public int lengthOfLastWord(String s){
        int n = s.length();
        if(n == 0) return 0;
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
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
        return stack.peek().length();
    }

    public static void main(String[] args) {
        Leetcode58 l = new Leetcode58();
        String s = "   fly me   to   the moon  ";
        System.out.println(l.lengthOfLastWord(s));
    }
}
