package lordy.search.exercise;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * No.40
 */
//TODO 超时
public class CombinationSum {


    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, res, indexList, candidates, target);

        return res.stream().distinct().collect(Collectors.toList());
    }

    public static void backtrack(int i, List<List<Integer>> res, List<Integer> indexList, int[] candidates, int target){
        int result = 0;
        for(Integer integer : indexList){
            result += candidates[integer];
        }
        if(result == target){
            List<Integer> list = new ArrayList<>();
            for(Integer integer : indexList){
                list.add(candidates[integer]);
            }
            res.add(list);
            return;
        }
        if(i >= candidates.length) return;
        for(int j = i; j < candidates.length && candidates[i] + result <= target; j++){
            indexList.add(j);
            backtrack(j + 1, res, indexList, candidates, target);
            indexList.remove(indexList.size() - 1);
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
