package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode18 {

    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n < 4) return res;
        Arrays.sort(nums);



        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = n - 1;
                if(l > r) break;
                while(l < r){
                    int val = nums[i] + nums[j] + nums[l] + nums[r];
                    if(val == target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                        while(l < r && nums[l] == nums[l + 1]){
                            l++;
                        }
                        while (l < r && nums[r - 1] == nums[r]){
                            r--;
                        }
                        l++;
                        r--;
                    }else if(val > target){
                        r--;
                    }else {
                        l++;
                    }
                }

            }
        }
        return res;
    }
}
