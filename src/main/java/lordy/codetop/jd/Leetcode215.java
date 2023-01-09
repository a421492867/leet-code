package lordy.codetop.jd;

public class Leetcode215 {

    public int findKthLargest(int[] nums, int k){
        return select(nums, 0, nums.length - 1, nums.length - k);
    }

    private int select(int[] nums, int l, int r, int k){
        int q = partition(nums, l, r);
        if(q == k) return nums[q];
        return q > k ? select(nums, l, q - 1, k) : select(nums, q + 1, r, k);
    }

    private int partition(int[] nums, int l, int r){
        int x = nums[r], i = l - 1;
        for(int j = l; j < r; j++){
            if(nums[j] <= x){
                swap(nums, ++i, j);
            }
        }
        swap(nums, ++i, r);
        return i;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
