package lordy.binarysearch.exercise;

/**
 * No.540
 */
public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums){
        int l = 0, r = nums.length - 1, mid;
        while (l < r){
            mid = l + (r - l) / 2;
            if(nums[mid] == nums[mid - 1]){
                if((mid - l) % 2 == 0){
                    r = mid - 2;
                }else {
                    l = mid + 1;
                }
            }else if (nums[mid] == nums[mid + 1]){
                if((r - mid) % 2 == 0){
                    l = mid + 2;
                }else {
                    r = mid - 1;
                }
            }else {
                return nums[mid];
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int nums[] = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
}
