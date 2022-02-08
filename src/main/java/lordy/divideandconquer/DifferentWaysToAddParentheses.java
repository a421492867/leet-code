package lordy.divideandconquer;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * No.241
 */
//TODO
public class DifferentWaysToAddParentheses {

    public static List<Integer> diffWaysToCompute(String expression){
        List<Integer> ways = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for(int l : left){
                    for(int r : right){
                        switch (c){
                            case '+':
                                ways.add(l + r);
                                break;
                            case '-':
                                ways.add(l - r);
                                break;
                            case '*':
                                ways.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        if(ways.isEmpty()){
            ways.add(Integer.parseInt(expression));
        }
        return ways;
    }

    public static void main(String[] args) {
        String expression = "2*3-4*5+6";
        System.out.println(JSON.toJSONString(diffWaysToCompute(expression)));
    }

}
