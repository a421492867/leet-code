package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode454 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int n = nums1.length;

        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int need = -(nums1[i] + nums2[j]);
                map.put(need, map.getOrDefault(need, 0) + 1);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map.containsKey(nums3[i] + nums4[j])){
                    res += map.get(nums3[i] + nums4[j]);
                }
            }
        }
        return res;
    }
}
