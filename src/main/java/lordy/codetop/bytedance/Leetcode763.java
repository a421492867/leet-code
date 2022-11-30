package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Leetcode763 {

    public List<Integer> partitionLabels(String s){
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            letters[c - 'a'] = i;
        }

        List<Integer> res = new ArrayList<>();
        int r = -1, l = 0;
        for(int i = 0; i < s.length(); i++){
            r = Math.max(r, letters[s.charAt(i) - 'a']);
            if(r == i){
                res.add(r - l + 1);
                l = i + 1;
            }
        }
        return res;
    }
}
