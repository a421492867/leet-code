package lordy.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * No.242
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
            if(map.get(t.charAt(i)) < 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
