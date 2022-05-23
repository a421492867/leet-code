package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode763 {

    public List<Integer> partitionLabels(String s){


        int[] letters = new int[26];

        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            letters[c - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int end = -1, l = 0;
        for(int i = 0; i < n; i++){
            end = Math.max(letters[s.charAt(i) - 'a'], end);
            if(end == i){
                result.add(end - l + 1);
                l = i + 1;
            }
        }
        return result;
    }
}
