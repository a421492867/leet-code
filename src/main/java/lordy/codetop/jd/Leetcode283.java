package lordy.codetop.jd;

public class Leetcode283 {

    public void moveZeroes(int[] nums){
        int n = nums.length;
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
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
