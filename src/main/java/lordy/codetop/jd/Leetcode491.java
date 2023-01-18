package lordy.codetop.jd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode491 {

    public List<List<Integer>> findSubsequences(int[] nums){
        Set<List<Integer>> res = new HashSet<>();

        int n = nums.length;
        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            dfs(nums, i + 1, list, res);
        }
        List<List<Integer>> result = new ArrayList<>(res);
        return result;
    }

    private void dfs(int[] nums, int index, List<Integer> list, Set<List<Integer>> res){
        if(list.size() > 1){
            res.add(new ArrayList<>(list));
        }
        if(index >= nums.length){
            return;
        }

        for(int i = index; i < nums.length; i++){
            if(nums[i] >= list.get(list.size() - 1)){
                list.add(nums[i]);
                dfs(nums, i + 1, list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode491 l = new Leetcode491();
        int[] nums = {4,6,7,7};
        l.findSubsequences(nums);
    }
}
