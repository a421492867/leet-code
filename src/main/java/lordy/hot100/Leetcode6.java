package lordy.hot100;

import java.util.ArrayList;
import java.util.List;

public class Leetcode6 {

    public String covert(String s, int numRows){
        if (numRows < 2) return s;
        List<StringBuilder> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            list.add(new StringBuilder());
        }
        int index = 0, flag = -1;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            list.get(index).append(chars[i]);
            if(index == 0 || index == numRows - 1){
                flag = -flag;
            }
            index += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : list){
            res.append(sb.toString());
        }
        return res.toString();
    }
}
