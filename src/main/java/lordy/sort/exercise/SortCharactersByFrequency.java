package lordy.sort.exercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * No.451
 */
public class SortCharactersByFrequency {

    public static String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = map.entrySet().stream().sorted((m1, m2) -> m2.getValue() - m1.getValue()).collect(Collectors.toList());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < list.size(); i++){
            Character c = list.get(i).getKey();
            for(int j = 0; j < list.get(i).getValue(); j++){
                sb.append(c);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

}
