package lordy.hot100;

import java.util.*;

public class Leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String key = Arrays.toString(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
