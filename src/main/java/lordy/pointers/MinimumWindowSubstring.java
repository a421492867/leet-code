package lordy.pointers;

import java.util.HashMap;
import java.util.Map;

/**
 * No.76
 */
//TODO
public class MinimumWindowSubstring {

    public static String minWindow(String s, String t){
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char needChar = t.charAt(i);
            need.put(needChar, need.getOrDefault(needChar, 0) +1);
        }

        int left = 0, right = 0, valid = 0;

        int len = Integer.MAX_VALUE;

        int start = 0;
        while (right < s.length()){
            char addChar = s.charAt(right);
            window.put(addChar, window.getOrDefault(addChar, 0) + 1);
            right++;
            if(need.containsKey(addChar) && window.get(addChar).equals(need.get(addChar))){
                valid++;
            }
            while (valid == need.size()){
                if(right - left < len){
                    len = right - left;
                    start = left;
                }
                char removeChar = s.charAt(left);
                if(need.containsKey(removeChar) && window.get(removeChar).equals(need.get(removeChar))){
                    valid--;
                }
                window.put(removeChar, window.get(removeChar) - 1);
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
