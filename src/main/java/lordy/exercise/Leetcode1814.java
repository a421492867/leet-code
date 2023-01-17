package lordy.exercise;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1814 {

    private final double modN = 1e9 + 7;

    public int countNicePairs(int[] nums){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i] - rev(nums[i]);
            if(map.containsKey(val)){
                res += map.get(val);
                res %= modN;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);

        }
        return res;
    }


    public int rev(int num){
        String numStr = String.valueOf(num);
        int n = numStr.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            sb.append(numStr.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }


}
