package lordy.exercise;

public class Leetcode31 {

    public void nextPermutation(int[] nums){
        int n = nums.length;
        if(n == 0) return;
        int i = n - 2;
        while(i >=0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i){
        int l = i, r = nums.length - 1;
        while (l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}
