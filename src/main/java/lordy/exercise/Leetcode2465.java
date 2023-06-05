package lordy.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode2465 {

    public int distinctAverages(int[] nums){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r){
            int min = nums[l];
            int max = nums[r];
            int sum = min + max;
            set.add(sum);
            l++;
            r--;
        }
        return set.size();
    }

    public static void main(String[] args) {
        Leetcode2465 l = new Leetcode2465();
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        l.distinctAverages(nums);
    }
}
