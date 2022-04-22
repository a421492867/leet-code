package lordy.exercise;

//TODO 超时
public class Leetcode396 {

    public int maxRotateFunction(int[] nums){
        int n = nums.length;
        int k = 1;
        int res = Integer.MIN_VALUE;
        while (k <= n){
            rotate(nums, 1);
            res = Math.max(res, cal(nums, n));
            k++;
        }
        return res;
    }

    public void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

    }

    public void reverse(int[] nums, int l, int r){
        while (l < r){
            int x = nums[l];
            nums[l] = nums[r];
            nums[r] = x;
            l++;
            r--;
        }
    }

    public int cal(int[] nums, int n){
        int res = 0;
        for(int i = 0; i < n; i++){
            res += nums[i] * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        Leetcode396 l = new Leetcode396();
        int res = l.maxRotateFunction(nums);
        System.out.println(res);
    }
}
