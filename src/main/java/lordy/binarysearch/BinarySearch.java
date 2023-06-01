package lordy.binarysearch;

import java.util.Arrays;

/**
 * No.704
 */
public class BinarySearch {


    public static int search(int[] nums, int target){
        int n = nums.length;
        if(n == 1){
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n, mid;
        while (l <= r){
            mid = l + (r - l) / 2;
            if(nums[mid] < target){
                l = mid + 1;
            }else if(nums[mid] > target){
                r = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5};
        int target = 5;
        search(nums, target);
    }
}
