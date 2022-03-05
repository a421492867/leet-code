package lordy.hot100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 超出时间限制
 */
public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtrack(nums, 0, l, r);
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> list : r){
            List<Integer> li = new ArrayList<>();
            li.add(nums[list.get(0)]);
            li.add(nums[list.get(1)]);
            li.add(nums[list.get(2)]);
            Collections.sort(li);
            if(!res.contains(li)){
                res.add(li);
            }
        }
        return res;

    }

    public void backtrack(int[] nums, int target, List<Integer> list, List<List<Integer>> res){
        if(list.size() == 3 && target == 0){
            List<Integer> l = new ArrayList<>(list);
            Collections.sort(l);
            if(!res.contains(l)){
                res.add(l);
            }
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(list.size() == 3){
                return;
            }
            if(!list.contains(i)){
                list.add(i);
                backtrack(nums, target - nums[i], list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode15 l = new Leetcode15();
        int[] nums = {-1,0,1,2,-1,-4};
        l.threeSum(nums);
    }
}
