package lordy.hot100;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(nums, res, list);
        return res;
    }

    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> list){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtrack(nums, res, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
