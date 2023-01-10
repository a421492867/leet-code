package lordy.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Leetcode2531 {

    public boolean isItPossible(String word1, String word2){
        Map<Character, Integer> map1 =  new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for(int i = 0; i < word2.length(); i++){
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        for(Character key : map1.keySet()){
            for (Character key2 : map2.keySet()){
                if(check(map1, key, map2, key2)) return true;
            }
        }
        return false;
    }

    private boolean check(Map<Character, Integer> map1, Character key1, Map<Character, Integer> map2, Character key2){
        int res1 = map1.size(), res2 = map2.size();
        if(!map1.containsKey(key2)){
            res1 += 1;
        }
        if(map1.get(key1) == 1 && key1 != key2){
            res1--;
        }
        if(!map2.containsKey(key1)){
            res2 += 1;
        }
        if(map2.get(key2) == 1 && key1 != key2){
            res2--;
        }
        return res1 == res2;
    }

    public static void main(String[] args) {
        Leetcode2531 l = new Leetcode2531();
        String word1 = "aa";
        String word2 = "ab";
        l.isItPossible(word1, word2);
    }
}
