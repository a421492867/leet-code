package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        dfs(s,0, 0, "", res);
        return res;
    }

    public void dfs(String s, int cnt, int index, String str, List<String> res){
        if(cnt == 4 || index == s.length()){
            if(cnt == 4 && index == s.length()){
                res.add(str.substring(0, str.length() - 1));
            }
            return;
        }

        for(int i = 1; i <= 3; i++){
            if(index + i > s.length()) return;
            if(s.charAt(index) == '0' && i != 1) return;
            if(i == 3 && Integer.parseInt(s.substring(index, index + i)) > 255) return;
            str += s.substring(index, index + i) + '.';
            dfs(s, cnt + 1, index + i, str, res);
            str = str.substring(0, str.length() - i - 1);

        }
    }
}
