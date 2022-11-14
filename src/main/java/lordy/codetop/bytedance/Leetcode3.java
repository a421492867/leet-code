package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Leetcode3 {


    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        if(n == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        int res = Integer.MIN_VALUE;
        while (r < n){
            char cur = s.charAt(r++);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            while (map.get(cur) > 1){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l);
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
