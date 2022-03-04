package lordy.hot100;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode17 {

    public List<String> letterCombinations(String digits){
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int n = digits.length();
        List<String> res = new ArrayList<>();
        if(n == 0){
            return res;
        }
        backtrack(digits, map, 0, "", res);
        return res;
    }

    public void backtrack(String digits, Map<Character, String> map, int index, String curRes, List<String> res){
        if(curRes.length() == digits.length()){
            res.add(curRes);
            return;
        }
        Character curChar = digits.charAt(index);
        String keys = map.get(curChar);
        for(int i = 0; i < keys.length(); i++){
            curRes += keys.charAt(i);
            backtrack(digits, map, index + 1, curRes, res);
            curRes = curRes.substring(0, curRes.length() - 1);
        }
    }


    public static void main(String[] args) {
        Leetcode17 l = new Leetcode17();
        System.out.println(JSON.toJSONString(l.letterCombinations("23")));
    }



}
