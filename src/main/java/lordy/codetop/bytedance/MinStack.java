package lordy.codetop.bytedance;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> dataStack;

    private Stack<Integer> minStack;

    public MinStack() {
        this.dataStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val){
        dataStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
            return;
        }
        if(val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop(){
        int val = dataStack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        return dataStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
