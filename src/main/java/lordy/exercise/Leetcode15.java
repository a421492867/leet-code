package lordy.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n < 3) return res;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(i != 0 && nums[i - 1] == nums[i]){
                continue;
            }

            int j = i + 1, k = n - 1;
            while (j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    res.add(list);
                    while (j < k && nums[j] == nums[j + 1]){
                        j++;
                    }
                    while (j < k && nums[k - 1] == nums[k]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        return res;
    }
}
