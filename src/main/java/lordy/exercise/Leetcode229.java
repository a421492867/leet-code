package lordy.exercise;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode229 {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > n / 3){
                res.add(key);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Leetcode229 l = new Leetcode229();
        System.out.println(JSON.toJSONString(l.majorityElement(nums)));

    }
}
