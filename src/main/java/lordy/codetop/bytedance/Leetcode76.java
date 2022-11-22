package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.Map;

public class Leetcode76 {

    public String minWindow(String s, String t){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = 0, len = Integer.MAX_VALUE, index = -1;
        int n = s.length();
        while (r < n){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
            }
            while (helper(map)){
                if(r - l + 1 < len){
                    len = r - l + 1;
                    index = l;
                }
                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                }
                l++;
            }
            r++;
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(index, index + len);
    }

    private boolean helper(Map<Character, Integer> map){
        for(Character key : map.keySet()){
            if(map.get(key) > 0){
                return false;
            }
        }
        return true;
    }
}
