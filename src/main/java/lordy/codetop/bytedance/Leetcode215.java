package lordy.codetop.bytedance;

public class Leetcode215 {

    public int findKthLargest(int[] nums, int k){
        return select(nums, 0, nums.length - 1, nums.length - k);
    }

    private int select(int[] nums, int l, int r, int k){
        int q = partition(nums, l, r);
        if(q == k){
            return nums[q];
        }
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

    private void swap(int[] nums, int l, int r){
        int x = nums[l];
        nums[l] = nums[r];
        nums[r] = x;
    }

    public static void main(String[] args) {
        Leetcode215 l = new Leetcode215();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        l.findKthLargest(nums, 4);
    }
}
