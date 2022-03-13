package lordy.hot100;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {

    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int res = 0;
        for(Integer num : set){
            int cur = num;
            if(!set.contains(cur - 1)){
                while (set.contains(cur + 1)){
                    cur++;
                }
            }
            res = Math.max(res, cur - num + 1);
        }
        return res;
    }


}
