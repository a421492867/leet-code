package lordy.structure.stackandqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * No.155
 */
public class MinStack {

    private Stack<Integer> dataStack;

    private Stack<Integer> minStack;

    public MinStack(){
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        dataStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop(){
       int x = dataStack.pop();
       if(x == minStack.peek()){
           minStack.pop();
       }
    }

    public int top(){
        return dataStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }



}
