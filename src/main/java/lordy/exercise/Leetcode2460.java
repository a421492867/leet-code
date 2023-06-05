package lordy.exercise;

public class Leetcode2460 {

    public int[] applyOperations(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] = nums[i] << 1;
                nums[i + 1] = 0;
            }
        }

        int l = 0;
        while (l < n){
            if(nums[l] == 0){
                int k = l + 1;
                while (k < n && nums[k] == 0){
                    k++;
                }
                if(k < n){
                    swap(nums, l, k);
                }else {
                    break;
                }
            }
            l++;
        }
        return nums;
    }

    private void swap(int[] nums, int l, int r){
        int x = nums[l];
        nums[l] = nums[r];
        nums[r] = x;
    }
}
