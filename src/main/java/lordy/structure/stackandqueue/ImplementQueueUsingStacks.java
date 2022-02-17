package lordy.structure.stackandqueue;

import java.util.Stack;

/**
 * No.232
 */
public class ImplementQueueUsingStacks {

    private class MyQueue{
        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public MyQueue(){
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x){
            inStack.push(x);
        }

        public int pop(){
            if(outStack.isEmpty()){
                while (!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
            }

            return outStack.pop();
        }

        public int peek(){
            if(outStack.isEmpty()){
                while (!inStack.isEmpty()){
                    outStack.push(inStack.pop());
                }
            }
            return outStack.peek();
        }

        public boolean empty(){
            return inStack.empty() && outStack.isEmpty();
        }
    }
}
