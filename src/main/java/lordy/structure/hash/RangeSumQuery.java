package lordy.structure.hash;

/**
 * No.303
 */
public class RangeSumQuery {

    public static class NumArray{

        private static int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public static int sumRange(int left, int right){
            int sum = 0;
            for(int i = left; i <= right; i++){
                sum += nums[i];
            }
            return sum;
        }
    }
}
