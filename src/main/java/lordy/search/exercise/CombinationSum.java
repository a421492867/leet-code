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
        int m = candidates.length;
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
        for(int j = i; j < candidates.length; j++){
            indexList.add(j);
            backtrack(j + 1, res, indexList, candidates, target);
            indexList.remove(indexList.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] candidates = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        int target = 27;
        System.out.println(JSON.toJSONString(combinationSum2(candidates, target)));
    }
}
