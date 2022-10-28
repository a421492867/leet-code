package lordy.search.exercise;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * No.40
 */
public class CombinationSum {


    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
       Arrays.sort(candidates);
       List<List<Integer>> res = new ArrayList<>();
       backtrack(candidates, target, new ArrayList<Integer>(), res, 0);
       return res;
    }

    public static void backtrack(int[] candidates, int target, List<Integer> list, List<List<Integer>> res, int index){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i - 1]) continue;
            if(target - candidates[i] >= 0){
                list.add(candidates[i]);
                backtrack(candidates, target - candidates[i], list, res, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 27;
        long start = System.nanoTime();
        List<List<Integer>> res = combinationSum2(candidates, target);
        long end = System.nanoTime();
        System.out.println(JSON.toJSONString(res));
        System.out.println(end - start);
    }
}
