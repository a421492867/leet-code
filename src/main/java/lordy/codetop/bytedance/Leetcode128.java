package lordy.codetop.bytedance;

import java.util.HashSet;
import java.util.Set;

public class Leetcode128 {

    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int max = 0;
        for(int key : set){
            int cur = key;
            if (!set.contains(cur - 1)){
                while (set.contains(cur + 1)){
                    cur++;
                }
            }
            max = Math.max(max, cur - key + 1);
        }
        return max;
    }
}
