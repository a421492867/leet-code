package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560 {

    public int subarraySum(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int res = 0 ;
        for(int i = 0; i < n; i++){
            pre += nums[i];
            if(map.containsKey(pre - k)){
                res += map.get(pre -k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return res;
    }
}
