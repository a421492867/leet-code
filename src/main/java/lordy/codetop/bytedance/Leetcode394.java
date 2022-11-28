package lordy.codetop.bytedance;

import java.util.Stack;

public class Leetcode394 {

    public String decodeString(String s){
        StringBuilder sb = new StringBuilder();
        int multi = 0;
        Stack<Integer> multiStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '['){
                multiStack.push(multi);
                resStack.push(sb.toString());
                multi = 0;
                sb = new StringBuilder();
            }else if(c == ']'){
                StringBuilder temp = new StringBuilder();
                int curMulti = multiStack.pop();
                for(int i = 0; i < curMulti; i++){
                    temp.append(sb);
                }
                sb = new StringBuilder(resStack.pop() + temp);
            }else if(c >= '0' && c <= '9'){
                multi = multi * 10 + (c - '0');
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
