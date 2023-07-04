package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> have = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            have.put(c, have.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(!have.containsKey(c) || have.get(c) == 0) return false;
            have.put(c, have.get(c) - 1);
        }
        return true;
    }
}
