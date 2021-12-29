package lordy.sort;

import java.util.*;
import java.util.stream.Collectors;

/**
 * No.347
 */
public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.entrySet().stream().sorted((m1, m2) -> m2.getValue() - m1.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
