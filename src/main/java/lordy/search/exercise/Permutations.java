package lordy.search.exercise;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * No.47
 */
public class Permutations {

    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res;
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> indexList = new ArrayList<>();
        backtrack(set, indexList, nums);
        res = new ArrayList<>(set);

        return res;
    }

    public static void backtrack(Set<List<Integer>> set, List<Integer> indexList, int[] nums){
        if(indexList.size() == nums.length){
            List<Integer> list = new ArrayList<>();
            for(Integer index : indexList){
                list.add(nums[index]);
            }
            set.add(list);
            return;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(!indexList.contains(i)){
                indexList.add(i);
                backtrack(set, indexList, nums);
                indexList.remove(indexList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(JSON.toJSONString(permuteUnique(nums)));
    }
}
