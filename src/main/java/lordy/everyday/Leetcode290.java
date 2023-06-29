package lordy.everyday;

import netscape.security.UserTarget;

import java.util.HashMap;
import java.util.Map;

public class Leetcode290 {

    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if(strings.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String str = strings[i];
            char c = pattern.charAt(i);
            if(map.containsKey(c) && !str.equals(map.get(c))){
                return false;
            }
            if(map2.containsKey(str) && c != map2.get(str)){
                return false;
            }
            map.put(c, str);
            map2.put(str, c);
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode290 l = new Leetcode290();
        String pattern = "abba";
        String s = "dog cat cat fish";

    }
}
