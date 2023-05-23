package lordy.exercise;

import java.util.Stack;

public class Leetcode2696 {

    public int minLength(String s){
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        int n = array.length;
        for(int i = 0; i < n; i++){
            if(array[i] == 'B'){
                if(!stack.isEmpty() && stack.peek() == 'A'){
                    stack.pop();
                }else {
                    stack.push(array[i]);
                }
            }else if(array[i] == 'D'){
                if(!stack.isEmpty() && stack.peek() == 'C'){
                    stack.pop();
                }else {
                    stack.push(array[i]);
                }
            }else {
                stack.push(array[i]);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        Leetcode2696 l = new Leetcode2696();
        String s = "ACBBD";
        System.out.println(l.minLength(s));
    }
}
