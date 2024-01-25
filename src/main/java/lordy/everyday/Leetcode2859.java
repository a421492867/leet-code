package lordy.everyday;

import java.util.List;

public class Leetcode2859 {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res = 0;
        for(int i = 0; i <nums.size(); i++){
            if(count(i, k)){
                res += nums.get(i);
            }
        }
        return res;
    }


    private boolean count(int num, int k){
        int x = 0;
        while (num != 0){
            num = num & (num - 1);
            x++;
        }
        return x == k;
    }
}
