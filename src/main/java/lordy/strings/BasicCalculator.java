package lordy.strings;

import java.util.Deque;
import java.util.LinkedList;

/**
 * No.227
 */
public class BasicCalculator {

    public static int calculate(String s){
        Deque<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1){
                switch (preSign){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }

}
