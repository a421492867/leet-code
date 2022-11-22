package lordy.codetop.bytedance;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                res[0] = i;
                res[1] = map.get(nums[i]);
                return res;
            }
            map.put(target - nums[i], i);
        }
        return res;
    }
}
