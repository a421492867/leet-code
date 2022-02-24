package lordy.structure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * No.560
 */
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k){
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            sum += num;
            if(sum == k){
                count++;
            }
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
