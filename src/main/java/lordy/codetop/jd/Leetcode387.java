package lordy.codetop.jd;

import java.util.HashMap;
import java.util.Map;

public class Leetcode387 {

    public int firstUniqChar(String s){

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int res = Integer.MAX_VALUE;
        for(Character c : map.keySet()){
            if(map.get(c) == 1){
                res = Math.min(res, s.indexOf(c));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
