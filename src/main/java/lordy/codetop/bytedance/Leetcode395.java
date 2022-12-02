package lordy.codetop.bytedance;

import lordy.search.MaxAreaOfIsland;

import java.util.HashMap;
import java.util.Map;

public class Leetcode395 {

    public int longestSubstring(String s, int k){
        int n = s.length();
        if(n < k) return 0;
        Map<Character, Integer> cnt = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            cnt.put(s.charAt(i), cnt.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(char c : cnt.keySet()){
            if(cnt.get(c) < k){
                int res = 0;
                for(String t : s.split(String.valueOf(c))){
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Leetcode395 l = new Leetcode395();
        l.longestSubstring("aaabb", 3);
        System.out.println();
    }
}
