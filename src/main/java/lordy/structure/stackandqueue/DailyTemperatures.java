package lordy.structure.stackandqueue;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Stack;

/**
 * No.739
 */
public class DailyTemperatures {

    public static int[] dailyTemperature(int[] temperatures){
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Integer> stack = new Stack();
        Arrays.fill(res, 0);
        for(int i = 0; i < length; i++){
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(JSON.toJSONString(dailyTemperature(temperatures)));
    }
}
