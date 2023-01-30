package lordy.codetop.jd;

public class Leetcode162 {

//    public int findPeakElement(int[] nums){
//        int n = nums.length;
//        int l = 0, r = n - 1;
//        while (l < r){
//            int mid = l + r >> 1;
//            if(nums[mid] > nums[mid + 1]) r = mid;
//            else l = mid + 1;
//        }
//        return r;
//    }

    public int findPeakElement(int[] nums){
        int n = nums.length;
        int[] array = new int[n + 2];
        array[0] = Integer.MIN_VALUE;
        array[n + 1] = Integer.MIN_VALUE;
        System.arraycopy(nums, 0, array, 1, n);
        for(int i = 1; i < n + 1; i++){
            if(array[i - 1] < array[i] && array[i + 1] < array[i]){
                return i - 1;
            }
        }
        return -1;
    }
}
