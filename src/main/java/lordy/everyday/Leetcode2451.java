package lordy.everyday;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode2451 {

    public String oddString(String[] words){
        int n = words[0].length();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : words){
            char[] array = s.toCharArray();
            char[] chars = new char[n - 1];
            for(int i = 0; i < n - 1; i++){
                char cur = (char) (array[i + 1] - array[i]);
                chars[i] = cur;
            }
            String str = String.valueOf(chars);
            List<String> list;
            if(map.containsKey(str)){
                list = map.get(str);
            }else {
                list = new ArrayList<>();
            }
            list.add(s);
            map.put(str, list);
        }
        for(String key : map.keySet()){
            if(map.get(key).size() == 1){
                return map.get(key).get(0);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Leetcode2451 l = new Leetcode2451();
        String[] words = {"abm", "bcn", "alm"};
        String res = l.oddString(words);
        System.out.println(res);
    }

}
