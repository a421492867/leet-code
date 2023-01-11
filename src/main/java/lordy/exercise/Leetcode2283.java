package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode2283 {

    public boolean digitCount(String num){
        Map<Character, Integer> map = new HashMap<>();
        int n = num.length();
        for(int i = 0; i < n; i++){
            map.put(num.charAt(i), map.getOrDefault(num.charAt(i), 0) + 1);
        }

        for(int i = 0; i < n; i++){
            Character c = (char)(i + 48);
            int count = num.charAt(i) - '0';
            if(count == 0){
                if(map.containsKey(c)) return false;
            }else{
                if(!map.containsKey(c) || map.get(c) != count) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode2283 l = new Leetcode2283();
        String num = "1";
        System.out.println(l.digitCount(num));
    }
}
