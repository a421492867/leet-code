package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0) return res;
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> list, List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtrack(nums, list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
