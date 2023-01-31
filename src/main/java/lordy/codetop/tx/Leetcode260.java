package lordy.codetop.tx;

import java.util.HashMap;
import java.util.Map;

public class Leetcode260 {

    public int[] singleNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] res = new int[2];
        int index = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                res[index++] = key;
            }
        }
        return res;
    }
}
