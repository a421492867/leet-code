package lordy.exercise;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Leetcode131 {

    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), "", s, 0);
        return res;
    }

    public void dfs(List<List<String>> res, List<String> list, String curStr, String s, int index){
        if(index >= s.length() && helper(curStr)){
            List<String> curList = new ArrayList<>(list);
            curList.add(curStr);
            res.add(new ArrayList<>(curList));
            return;
        }else if(index == s.length() && !helper(curStr)) return;
        curStr = curStr + s.charAt(index);
        if(helper(curStr)){
            list.add(curStr);
            dfs(res, list, "", s, index + 1);
            list.remove(list.size() - 1);
        }
        dfs(res, list, curStr, s, index + 1);
    }


    public boolean helper(String str){
        if("".equals(str)) return false;
        int i = 0, n = str.length() - 1;
        while (i <= n){
            if(str.charAt(i) == str.charAt(n)){
                i++;
                n--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode131 l = new Leetcode131();
        String s  = "aab";
        List<List<String>> res = l.partition(s);
        System.out.println(JSON.toJSONString(res));
    }
}
