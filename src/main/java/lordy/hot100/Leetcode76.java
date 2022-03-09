package lordy.hot100;

import java.util.HashMap;
import java.util.Map;

public class Leetcode76 {

    public String minWindow(String s, String t){
        int m = s.length(), n = t.length();
        if(m == 0 || n > m) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int p1 = 0, p2 = 0, preIndex = -1, len = Integer.MAX_VALUE;
        while (p2 < m){
            char ch = s.charAt(p2);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
            }
            while (p1 < m && contain(map)){
                if(p2 - p1 + 1 < len){
                    preIndex = p1;
                    len = p2 - p1 + 1;
                }
                if(map.containsKey(s.charAt(p1))){
                    map.put(s.charAt(p1), map.get(s.charAt(p1)) + 1);
                }
                p1++;
            }
            p2++;
        }
        if(len == Integer.MAX_VALUE) return "";
        return s.substring(preIndex, preIndex + len);
    }

    public boolean contain(Map<Character, Integer> map){
        for(char c : map.keySet()){
            if(map.get(c) > 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode76 l = new Leetcode76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        l.minWindow(s, t);
    }
}
