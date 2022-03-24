package lordy.hot100;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode78 {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        backtrack(nums, new ArrayList<>(), res, 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> list, List<List<Integer>> res, int index){

        if(!res.contains(list)){
            res.add(new ArrayList<>(list));
        }
        if(index == nums.length) return;
        for(int i = index; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backtrack(nums, list, res, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode78 l = new Leetcode78();
        int[] nums = {1,2,3};
        System.out.println(JSON.toJSONString(l.subsets(nums)));
    }
}
