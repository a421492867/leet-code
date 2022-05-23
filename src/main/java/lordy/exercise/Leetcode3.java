package lordy.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode3 {

    public int lengthOfLongestSubstring(String s){
        int n = s.length(), res = 0;

        Queue<Character> stack = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(stack.isEmpty() || !stack.contains(s.charAt(i))){
                stack.offer(s.charAt(i));
            }else{
                res = Math.max(res, stack.size());
                while(stack.peek() != s.charAt(i)){
                    stack.poll();
                }
                char c = stack.poll();
                stack.offer(c);
            }
        }
        return res;
    }
}
