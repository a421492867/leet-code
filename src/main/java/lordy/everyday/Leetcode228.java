package lordy.everyday;

import java.util.ArrayList;
import java.util.List;

public class Leetcode228 {

    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        if(n == 0) return list;
        int pre = nums[0], last = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] - last == 1){
                last = nums[i];
            }else{
                if(last == pre){
                    list.add(String.valueOf(pre));
                }else {
                    list.add(pre + "->" + last);
                }
                pre = nums[i];
                last = nums[i];
            }
        }
        if(pre == last){
            list.add(String.valueOf(pre));
        }else {
            list.add(pre + "->" + last);
        }
        return list;

    }
}
