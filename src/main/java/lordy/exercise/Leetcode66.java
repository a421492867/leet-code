package lordy.exercise;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Leetcode66 {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int flag = 0;
        Deque<Integer> queue = new LinkedList<>();
        int initVal = digits[n - 1] + 1;
        flag = initVal / 10;
        queue.addFirst(initVal % 10);
        for(int i = n - 2; i >=0; i--){
            int val = digits[i] + flag;
            flag = val / 10;
            val = val % 10;
            queue.addFirst(val);
        }
        if(flag > 0){
            queue.addFirst(1);
        }
        int[] res = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()){
            res[index++] = queue.pop();
        }
        return res;


    }

    public static void main(String[] args) {
        Leetcode66 l = new Leetcode66();
        int[] nums = {1,2,3};
        System.out.println(JSON.toJSONString(l.plusOne(nums)));
    }
}
