package lordy.hot100;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Leetcode15 {

    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(n < 3 || nums[0] > 0) return res;


        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (l < r && nums[l] == nums[l + 1]){
                        l++;
                    }while (l < r && nums[r - 1] == nums[r]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return res;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> r = new ArrayList<>();
//        List<Integer> l = new ArrayList<>();
//        backtrack(nums, 0, l, r);
//        List<List<Integer>> res = new ArrayList<>();
//        for(List<Integer> list : r){
//            List<Integer> li = new ArrayList<>();
//            li.add(nums[list.get(0)]);
//            li.add(nums[list.get(1)]);
//            li.add(nums[list.get(2)]);
//            Collections.sort(li);
//            if(!res.contains(li)){
//                res.add(li);
//            }
//        }
//        return res;
//
//    }
//
//    public void backtrack(int[] nums, int target, List<Integer> list, List<List<Integer>> res){
//        if(list.size() == 3 && target == 0){
//            List<Integer> l = new ArrayList<>(list);
//            Collections.sort(l);
//            if(!res.contains(l)){
//                res.add(l);
//            }
//            return;
//        }
//
//        for(int i = 0; i < nums.length; i++){
//            if(list.size() == 3){
//                return;
//            }
//            if(!list.contains(i)){
//                list.add(i);
//                backtrack(nums, target - nums[i], list, res);
//                list.remove(list.size() - 1);
//            }
//        }
//    }

    public static void main(String[] args) {
        Leetcode15 l = new Leetcode15();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(JSON.toJSONString(l.threeSum(nums)));
    }
}
