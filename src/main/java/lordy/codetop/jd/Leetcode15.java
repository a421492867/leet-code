package lordy.codetop.jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (l < r && nums[l + 1] == nums[l]){
                        l++;
                    }
                    while (l < r && nums[r - 1] == nums[r]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return res;
    }
}
