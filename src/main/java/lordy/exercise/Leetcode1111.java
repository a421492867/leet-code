package lordy.exercise;

import java.util.Stack;

public class Leetcode1111 {

    public int[] maxDepthAfterSplit(String seq){
        int n = seq.length();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(i == 0){
                stack.push(i);
            }
        }
    }
}
