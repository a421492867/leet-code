package lordy.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * No.215
 */
public class KthLargestElementInAnArray {

    public static int findKthLargest(int nums[], int k){
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k];

    }
}
