package lordy.binarysearch;

/**
 * No.34
 */
public class FindFirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target){
        int[] result = {-1,-1};
        if(nums.length ==  0){
            return result;
        }
        long l = 0, r = nums.length - 1, mid;   //需要nums.length - 1  左闭右闭
        while (l <= r){
            mid = (l + r) / 2;
            if(nums[(int)mid] < target){
                l = mid + 1;
            }else if(nums[(int)mid] > target){
                r = mid - 1;
            }else {
                int leftIndex = leftIndex(mid, nums, target);
                int rightIndex = rightIndex(mid, nums, target);
                result[0] = leftIndex;
                result[1] = rightIndex;
                return result;
            }
        }


        return result;
    }

    public static int leftIndex(long location, int nums[], int target){
        int loc = (int) location;
        for(int i = loc; i >= 0; i--){
            if(nums[i] == target){
                loc = i;
            }
        }
        return loc;
    }

    public static int rightIndex(long location, int nums[], int target){
        int loc = (int) location;
        for(int i = loc; i < nums.length; i++){
            if(nums[i] == target){
                loc = i;
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 3;
        int[] s = searchRange(nums, target);
        for(int i : s){
            System.out.println(i);
        }
    }
}
