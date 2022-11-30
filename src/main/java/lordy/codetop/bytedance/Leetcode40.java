package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] candidates, int index, int target, List<Integer> list, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            if(target - candidates[i] >= 0){
                list.add(candidates[i]);
                dfs(candidates, i + 1, target - candidates[i], list, res);
                list.remove(list.size() - 1);
            }
        }
    }
}
