package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode560 {


    public int subArraySum(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
