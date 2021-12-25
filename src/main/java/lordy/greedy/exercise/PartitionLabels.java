package lordy.greedy.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * No.763
 * 个人感觉不像贪心
 */
public class PartitionLabels {

    public static List<Integer> partition(String s){
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }

        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            end = end > map.get(s.charAt(i)) ? end : map.get(s.charAt(i));
            if(i == end){
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        partition(s);
    }


}
