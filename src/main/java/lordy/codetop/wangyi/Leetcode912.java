package lordy.codetop.wangyi;

public class Leetcode912 {

    public int[] sortArray(int[] nums){
        int n = nums.length;
        sort(nums, 0, n - 1);
        return nums;
    }

    private void sort(int[] nums, int l, int r){
        if(l >= r) return;
        int p = partition(nums, l, r);
        sort(nums, l, p -1);
        sort(nums, p + 1, r);
    }

    private int partition(int[] nums, int l, int r){
        int i = l, j = r + 1;
        int v = nums[l];
        while (true){
            while (nums[++i] < v) if (i == r) break;
            while (nums[--j] > v) if(j == l) break;
            if(i >= j) break;
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
