package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78 {

    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        if(nums.length == 0) return res;
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums,int j, List<Integer> list, List<List<Integer>> res){
        if(!res.contains(list)){
            res.add(new ArrayList<>(list));
        }
        if(list.size() == nums.length) return;
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtrack(nums, i + 1, list, res);
                list.remove(list.size() - 1);
            }

        }
    }
}
