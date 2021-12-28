package lordy.binarysearch.exercise;

/**
 * No.154
 */
//No.34
public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums){
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
