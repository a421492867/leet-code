package lordy.everyday;

import java.util.Arrays;
import java.util.List;

public class Leetcode2586 {

    public final List<Character> list = Arrays.asList('a','e','i','o','u');

    public int vowelStrings(String[] words, int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++){
            String word = words[i];
            int n = word.length();
            if(list.contains(word.charAt(0)) && list.contains(word.charAt(n - 1))){
                res++;
            }
        }

        return res;
    }
}
