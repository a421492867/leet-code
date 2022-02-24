package lordy.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * No.205
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t){
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i), y = t.charAt(i);
            if((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)){
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
}
