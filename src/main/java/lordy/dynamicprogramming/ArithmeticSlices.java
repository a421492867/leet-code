package lordy.dynamicprogramming;

/**
 * No.413
 */
public class ArithmeticSlices {

    public static int numberOfArithmeticSlices(int[] nums){
        if(nums.length <= 2) return 0;
        int result = 0;
        for(int i = 2; i < nums.length; i++){
            int j = i;
            while ( j < nums.length && nums[j - 1] - nums[j - 2] == nums[j] - nums[j - 1]){
                result++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices(nums));
    }
}
