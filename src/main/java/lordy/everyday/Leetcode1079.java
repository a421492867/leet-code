package lordy.everyday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1079 {

    public int numTilePossibilities(String titles){
        char[] array = titles.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : array){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Set<Character> title = new HashSet<>(map.keySet());
        return dfs(titles.length(), map, title) - 1;
    }

    private int dfs(int i, Map<Character, Integer> map, Set<Character> set){
        if(i == 0) return 1;
        int res = 1;
        for(char t : set){
            if(map.get(t) > 0){
                map.put(t, map.get(t) - 1);
                res += dfs(i - 1, map, set);
                map.put(t, map.get(t) + 1);
            }
        }
        return res;
    }
}
