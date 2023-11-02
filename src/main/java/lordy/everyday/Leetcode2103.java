package lordy.everyday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode2103 {

    public int countPoints(String rings) {
        char[] chars = rings.toCharArray();
        int n = chars.length;
        if(n == 0) return 0;
        Map<Character, Set<Character>> map = new HashMap<>();
        char color = chars[0];
        for(int i = 1; i < n; i++){
            if(i % 2 == 1){
                char num = chars[i];
                Set<Character> set = map.getOrDefault(num, new HashSet<>());
                set.add(color);
                map.put(num, set);
            }else {
                color = chars[i];
            }
        }

        int res = 0;
        for(Character key : map.keySet()){
            if(map.get(key).size() == 3) res++;
        }
        return res;
    }
}
