package lordy.structure.hash;

import java.util.*;

/**
 * No.128
 */
public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        for(int num : set){
            int cur = num;
            if(!set.contains(cur - 1)){
                while (set.contains(cur + 1)){
                    cur++;
                }
            }
            ans = Math.max(ans, cur - num + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
}
