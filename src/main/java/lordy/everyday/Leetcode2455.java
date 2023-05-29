package lordy.everyday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leetcode2455 {

    public int averageValue(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num % 3 == 0 && num % 2 == 0){
                list.add(num);
            }
        }
        int sum = 0;
        for(Integer n : list){
            sum += n;
        }
        int n = list.size();
        return n == 0 ? 0 : sum / n;
    }

    public static void main(String[] args) {
        Leetcode2455 l = new Leetcode2455();
        int[] nums = {4,4,9,10};
        l.averageValue(nums);
    }
}
