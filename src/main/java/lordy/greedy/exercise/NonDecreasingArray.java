package lordy.greedy.exercise;

/**
 * No.665
 */
//TODO
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums){
        int n = nums.length;
        int[] array = new int[n + 2];
        array[0] = Integer.MIN_VALUE;
        array[n + 1] = Integer.MAX_VALUE;
        System.arraycopy(nums, 0, array, 1, nums.length);

        int res = 0;

        for(int i = 1; i < n + 2; i++){
            if(array[i] < array[i - 1] && array[i] >= array[i - 2]){
                res++;
                array[i - 1] = array[i];
            }else if(array[i] < array[i - 1] && array[i] < array[i - 2]){
                array[i] = array[i - 1];
                res++;
            }
        }

        return res <= 1;
    }
}
