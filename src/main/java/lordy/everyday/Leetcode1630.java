package lordy.everyday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leetcode1630 {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r){
        List<Boolean> result = new ArrayList<>();
        int m = l.length;

        for(int i = 0; i < m; i++){
            int leftIndex = l[i];
            int rightIndex = r[i];
            List<Integer> list = new ArrayList<>();
            for(int j = leftIndex; j <= rightIndex; j++){
                list.add(nums[j]);
            }
            boolean res = helper(list);
            result.add(res);
        }
        return result;
    }

    private boolean helper(List<Integer> list){
        Collections.sort(list);
        int n = list.size();
        if(n == 1) return true;
        int diff = list.get(1) - list.get(0);
        for(int i = 1; i < n; i++){
            if(list.get(i) - list.get(i - 1) != diff){
                return false;
            }
        }
        return true;
    }
}
