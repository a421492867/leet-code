package lordy.codetop.bytedance;

public class Leetcode31 {

    public void nextPermutation(int[] nums){
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while (j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }

    private void reverse(int[] nums, int j){
        int r = nums.length - 1;
        while (j < r){
            swap(nums, j, r);
            j++;
            r--;
        }
    }
}
