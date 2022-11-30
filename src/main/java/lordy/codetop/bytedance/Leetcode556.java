package lordy.codetop.bytedance;

public class Leetcode556 {

    public int nextGreaterElement(int n){
        char[] nums = Integer.toString(n).toCharArray();

        int len = nums.length;
        int i = len - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i < 0) return -1;

        int j = len - 1;
        while (j >= 0 && nums[i] >= nums[j]){
            j--;
        }
        swap(nums, i, j);
        reverse(nums, i + 1);
        long ans = Long.parseLong(new String(nums));
        return ans > Integer.MAX_VALUE ? -1 : (int) ans;
    }


    private void swap(char[] nums, int i, int j){
        char x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }

    private void reverse(char[] nums, int i){
        int r = nums.length - 1;
        while (i < r){
            swap(nums, i, r);
            i++;
            r--;
        }
    }

    public static void main(String[] args) {
        Leetcode556 l = new Leetcode556();
        l.nextGreaterElement(12);
    }
}
