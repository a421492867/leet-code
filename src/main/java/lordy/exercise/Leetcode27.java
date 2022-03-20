package lordy.exercise;

public class Leetcode27 {

    public int removeElement(int[] nums, int val){
        int n = nums.length;
        if(n == 0) return -1;
        int l = 0, r = n;
        while (l < r){
            if(nums[l] == val){
                swap(nums, l, r - 1);
                r--;
            }else {
                l++;
            }
        }
        return l;
    }

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        Leetcode27 l = new Leetcode27();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(l.removeElement(nums, val));
    }
}
