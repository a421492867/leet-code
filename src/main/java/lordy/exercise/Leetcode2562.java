package lordy.exercise;

public class Leetcode2562 {

    public long findTheArrayConcVal(int[] nums){
        long res = 0;
        int n = nums.length;
        if(n == 1) return nums[0];

        int l = 0, r = n - 1;
        while (l < r){
            int lVal = nums[l];
            int rVal = nums[r];
            res += helper(lVal, rVal);
            l++;
            r--;
        }
        if(l == r){
            res += nums[l];
        }
        return res;
    }

    public long helper(int l, int r){
        String s = l + String.valueOf(r);
        int left = 0;
        long res = 0;
        while (left < s.length()){
            res = res * 10 + (s.charAt(left) - '0');
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7,52,2,4};
        Leetcode2562 l = new Leetcode2562();
        l.findTheArrayConcVal(nums);
    }


}
