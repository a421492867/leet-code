package lordy.hot100;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {


    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{i, map.get(nums[i])};
            }else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }
}
