package lordy.exercise;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode30 {

    public List<Integer> findSubstring(String s, String[] words){
        int wordNum = words.length, wordLen = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        Map<String, Integer> temp = new HashMap<>(map);
        List<Integer> res = new ArrayList<>();
        int l = 0, r = wordLen * wordNum - 1;
        while(r < s.length()){
            boolean flag = true;
            for(int i = l; i <= r; i += wordLen){
                String cur = s.substring(i, i + wordLen);
                if(!map.containsKey(cur) || map.get(cur) == 0){
                    flag = false;
                    break;
                }else {
                    map.put(cur, map.get(cur) - 1);
                }
            }
            map = new HashMap<>(temp);
            if(flag){
                res.add(l);
            }
            l++;
            r++;
        }
        return res;

    }


    public static void main(String[] args) {
        Leetcode30 l = new Leetcode30();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        l.findSubstring(s, words);


    }
}
