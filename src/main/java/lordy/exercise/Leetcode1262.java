package lordy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode1262 {

    public int maxSumDivThree(int[] nums){
        List<Integer> modOne = new ArrayList<>();
        List<Integer> modTwo = new ArrayList<>();
        int sum = 0, res = 0;
        for(int n : nums){
            if(n % 3 == 1) modOne.add(n);
            if(n % 3 == 2) modTwo.add(n);
            sum += n;
        }
        Collections.sort(modOne);
        Collections.sort(modTwo);
        if(sum % 3 == 0) return sum;
        if(sum % 3 == 2){
            int res1 = modTwo.size() > 0 ? sum - modTwo.get(0) : 0;
            int res2 = modOne.size() > 1 ? sum - modOne.get(0) - modOne.get(1) : 0;
            res = Math.max(res1, res2);
        }

        if(sum % 3 == 1){
            int res1 = modOne.size() > 0 ? sum - modOne.get(0) : 0;
            int res2 = modTwo.size() > 1 ? sum - modTwo.get(0) - modTwo.get(1) : 0;
            res = Math.max(res1, res2);
        }
        return res;


    }

    public static void main(String[] args) {
        Leetcode1262 l = new Leetcode1262();
        int[] nums = {3,6,5,1,8};
        l.maxSumDivThree(nums);
    }
}
