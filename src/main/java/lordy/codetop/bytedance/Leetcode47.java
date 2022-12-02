package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode47 {

    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res;
        Set<List<Integer>> set = new HashSet<>();
        backtrack(nums, set, new ArrayList<>());
        res = new ArrayList<>(set);
        return res;
    }

    private void backtrack(int[] nums, Set<List<Integer>> set, List<Integer> list){
        if(list.size() == nums.length){
            List<Integer> l = new ArrayList<>();
            for(int index : list){
                l.add(nums[index]);
            }
            set.add(l);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(i)){
                list.add(i);
                backtrack(nums, set, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
