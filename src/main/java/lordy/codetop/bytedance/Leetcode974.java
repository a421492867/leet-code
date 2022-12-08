package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.Map;

public class Leetcode974 {

    public int subarraysDivByK(int[] nums, int k){
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int res = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            int need = (sum % k + k) % k;
            if(map.containsKey(need)){
                res += map.get(need);
            }
            map.put(need, map.getOrDefault(need, 0) + 1);
        }

        return res;
    }


}
