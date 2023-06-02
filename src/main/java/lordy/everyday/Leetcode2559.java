package lordy.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode2559 {

    private final List<Character> list = Arrays.asList('a','e','i','o','u');
    public int[] vowelStrings(String[] words, int[][] queries){
        int n = words.length;
        int[] pre = new int[n + 1];
        pre[0] = 0;
        for(int i = 0; i < n; i++){
            String cur = words[i];
            if(check(cur)){
                pre[i + 1] = pre[i] + 1;
            }else {
                pre[i + 1] = pre[i];
            }
        }
        int len = queries.length;
        int[] res = new int[len];
        for(int i = 0; i < len; i++){
            res[i] = pre[queries[i][1] + 1] - pre[queries[i][0]];
        }
        return res;

    }

    private boolean check(String s){
        char[] array = s.toCharArray();
        int n = array.length;
        return list.contains(array[0]) && list.contains(array[n - 1]);
    }

    public static void main(String[] args) {
        Leetcode2559 l = new Leetcode2559();
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2}, {1,4}, {1,1}};
        l.vowelStrings(words, queries);
    }
}
