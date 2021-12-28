package lordy.binarysearch;

import java.util.Arrays;
import java.util.Collections;

/**
 * No.81
 */
//为了二分而二分 个人感觉无意义
public class SearchInRotatedSortedArray {

    public static boolean search(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }
}
