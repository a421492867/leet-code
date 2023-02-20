package lordy.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode2341 {

    public int[] numberOfpairs(int[] nums){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res1 = 0, res2 = n;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Integer key : map.keySet()){
            while (map.get(key) >= 2){
                map.put(key, map.get(key) - 2);
                res1++;
                res2 -= 2;
            }
        }

        return new int[]{res1, res2};
    }
}
