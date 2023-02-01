package lordy.codetop.jd;

import java.util.Stack;

public class CQueue {

    private Stack<Integer> inStack;

    private Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }


    public void appendTail(int value){
        while (!outStack.isEmpty()){
            inStack.push(outStack.pop());
        }
        inStack.push(value);
    }

    public int deleteHead(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return outStack.isEmpty() ? -1 : outStack.pop();
    }
}
