package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode438 {

    public List<Integer> findAnagrams(String s, String p){
        int m = s.length(), n = p.length();
        int[] need = new int[26];
        for(int i = 0; i < p.length(); i++){
            need[p.charAt(i) - 'a']++;
        }
        int[] window = new int[26];
        List<Integer> res = new ArrayList<>();
        int r = 0;
        while(r < m){
            char cur = s.charAt(r++);
            window[cur - 'a']++;
            if(r >= n){
                boolean flag = true;
                for(int i = 0; i < 26; i++){
                    if(need[i] != window[i]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    res.add(r - n);
                }
                window[s.charAt(r - n) - 'a']--;
            }
        }
        return res;
    }
}
