package lordy.hot100;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560 {

    public int subarraySum(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, res = 0;
        for(int i = 0; i < n; i++){
            res += nums[i];
            if(map.containsKey(res - k)){
                count += map.get(res - k);
            }
            map.put(res, map.getOrDefault(res, 0) + 1);
        }
        return count;
    }
}
