package lordy.codetop.tx;

import java.util.HashMap;
import java.util.Map;

public class Leetcode409 {

    public int longestPalindrome(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        for(char c : array){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        boolean hasOdd = false;
        for(Character key : map.keySet()){
            if(map.get(key) % 2 == 0){
                res += map.get(key);
            }else{
                res += map.get(key) - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? res + 1 : res;
    }
}
