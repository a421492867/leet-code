package lordy.exercise;

import java.util.Arrays;

public class Leetcode16 {
    
    public int threeSumClosest(int[] nums, int target){

        int n = nums.length;
        int res = Integer.MAX_VALUE / 2;

        int k = res - target;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            int l = i + 1, r = n - 1;
            while (l < r){
                int val = nums[i] + nums[l] + nums[r];
                if(Math.abs(target - val) < k){
                    k = Math.abs(target - val);
                    res = val;
                }
                if(val > target){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,4,8,16,32,64,128};
        int target = 82;
        Leetcode16 l = new Leetcode16();
        System.out.println(l.threeSumClosest(nums, target));
    }
}
