package lordy.structure.array;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * No.448
 */
public class FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums){
//        int length = nums.length;
//        Map<Integer, Object> map = new HashMap<>();
//        for(int i = 1; i <= length; i++){
//            map.put(i, null);
//        }
//        for(int i : nums){
//            map.remove(i);
//        }
//        List<Integer> res = new ArrayList<>();
//        for(Integer key : map.keySet()){
//            res.add(key);
//        }
//        return res;

        //原地Hash
        int n = nums.length;
        for(int num : nums){
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] <= n){
                res.add(i + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(JSON.toJSONString(findDisappearedNumbers(nums)));
    }
}
