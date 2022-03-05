package lordy.hot100;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, target, list, res);
        return res;
    }

    public void backtrack(int[] candidates, int target, List<Integer> list, List<List<Integer>> res){
        System.out.println(" target : " + target + " list : " + JSON.toJSONString(list));
        if(target == 0){
            List<Integer> list1 = new ArrayList<>(list);
            Collections.sort(list1);
            if(!res.contains(list1)){
                res.add(list1);
            }

            return;
        }
        for(int i = 0; i < candidates.length; i++){
            if(target - candidates[i] >= 0){
                list.add(candidates[i]);
                backtrack(candidates, target - candidates[i], list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode39 l = new Leetcode39();
        int[] candidates = {2,3,5};
        int target = 8;
        l.combinationSum(candidates, target);

    }
}
