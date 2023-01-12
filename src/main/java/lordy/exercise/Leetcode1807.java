package lordy.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode1807 {

    public String evaluate(String s, List<List<String>> knowledge){

        Map<String, String> map = new HashMap<>();
        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        boolean flag = false;
        StringBuilder cur = new StringBuilder();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '('){
                flag = true;
            }else if(c == ')'){
                flag = false;
                if(map.containsKey(cur.toString())){
                    sb.append(map.get(cur.toString()));
                }else {
                    sb.append('?');
                }
                cur = new StringBuilder();
            }else{
                if(!flag){
                    sb.append(c);
                }else{
                    cur.append(c);
                }
            }
        }
        return sb.toString();
    }


}
