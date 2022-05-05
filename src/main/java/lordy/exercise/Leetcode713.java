package lordy.exercise;

public class Leetcode713 {


    public int numSubarrayProductLessThank(int[] nums, int k){

        int n = nums.length;
        int l = 0, r = 0;
        int sum = 1;
        int res = 0;
        while (r < n){
            sum *= nums[r++];

            while (l < r && sum >= k){
                sum /= nums[l++];
            }
            res += r - l;
        }
        return res;

    }

    public static void main(String[] args) {
        Leetcode713 l = new Leetcode713();
        int[] nums = {10,5,2,6};
        System.out.println(l.numSubarrayProductLessThank(nums, 100));
    }
}
