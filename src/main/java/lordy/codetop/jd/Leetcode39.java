package lordy.codetop.jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, new ArrayList<>(), res, 0);
        return res;
    }

    private void dfs(int[] candidates, int target, List<Integer> list, List<List<Integer>> res, int index){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[i] <= target){
                list.add(candidates[i]);
                dfs(candidates, target - candidates[i], list, res, i);
                list.remove(list.size() - 1);
            }
        }
    }
}
