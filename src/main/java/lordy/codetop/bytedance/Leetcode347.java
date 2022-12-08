package lordy.codetop.bytedance;

import java.util.*;

public class Leetcode347 {

    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();

        for(Integer key : map.keySet()){
            list.add(map.get(key));
        }
        list.sort(((o1, o2) -> o2 - o1));
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            int freq = list.get(i);
            for(Integer key : map.keySet()){
                if(map.get(key) == freq){
                    res[i] = key;
                    map.remove(key);
                }
            }
        }
        return res;

    }
}
