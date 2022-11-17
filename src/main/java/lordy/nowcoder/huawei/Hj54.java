package lordy.nowcoder.huawei;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Hj54 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            System.out.println(end(s));
        }
    }


    //中缀转后缀
    public static Deque<String> mid2End(String str){
        StringBuilder number = new StringBuilder();

        Deque<String> deque = new LinkedList<>();

        Stack<Character> stack = new Stack<>();

        boolean flag = false;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                number.append(c);
            }else{
                if(number.length() > 0){
                    if(flag){
                        deque.add("-" + number.toString());
                        flag = false;
                    }else {
                        deque.add(number.toString());
                    }
                    number.delete(0, number.length());
                }

                if(c == '('){
                    stack.push(c);
                }else if(c == ')'){
                    char top = stack.peek();
                    while (top != '('){
                        deque.add(stack.pop() + "");
                        top = stack.peek();
                    }
                    stack.pop();
                }else if(c == '-' && (i == 0 || str.charAt(i - 1) == '(')){
                    flag = true;
                }else {
                    if(stack.size() <= 0 || stack.peek() == '(' || opeCompare(c, stack.peek())){
                        stack.push(c);
                    }else {
                        while (stack.size() > 0 && stack.peek() != '(' && !opeCompare(c, stack.peek())){
                            deque.add(stack.pop()+ "");
                        }
                        stack.push(c);
                    }
                }
            }
        }
        if(number.length() > 0){
            deque.add(number.toString());
        }
        while (stack.size() > 0){
            deque.add(stack.pop() + "");
        }
        return deque;
    }

    public static boolean opeCompare(char a, char b){
        if(a == '*' || a == '/'){
            if(b == '+' || b == '-'){
                return true;
            }
        }
        return false;
    }

    public static int end(String str){
        Deque<String> deque = mid2End(str);

        Stack<Integer> stack = new Stack<>();
        while (deque.size() > 0){
            String s = deque.pollFirst();
            if(s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9'){
                stack.push(Integer.parseInt(s));
            }else {
                int b = stack.pop();
                int a = stack.pop();
                int r = 0;
                switch (s.charAt(0)){
                    case '*':
                        r = a * b;
                        break;
                    case '/':
                        r = a / b;
                        break;
                    case '+':
                        r = a + b;
                        break;
                    case '-':
                        r = a - b;
                        break;
                    default:
                        break;
                }
                stack.push(r);
            }
        }
        return stack.pop();
    }
}
