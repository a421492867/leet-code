package lordy.exercise;

import java.util.*;

public class Leetcode398 {

    private Map<Integer, List<Integer>> map;

    public Leetcode398(int[] nums) {

        this.map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            List<Integer> list;
            if(map.containsKey(nums[i])){
                list = map.get(nums[i]);
            }else {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(nums[i], list);
        }
    }

    public int pick(int target){
        List<Integer> list = map.get(target);
        if(list.size() == 1) return list.get(0);
        int max = list.size();
        Random random = new Random();
        int rand = random.nextInt(max);
        return list.get(rand);
    }
}
