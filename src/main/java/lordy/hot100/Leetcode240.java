package lordy.hot100;

public class Leetcode240 {

    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix[0][0] > target) return false;
        for(int i = 0; i < matrix.length; i++){
            if(binarySearch(matrix[i], target)){
                return true;
            }
        }

        return false;
    }

    private boolean binarySearch(int[] nums, int target){
        int l = 0, r = nums.length - 1, mid;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(target > nums[mid]){
                l = mid + 1;
            }else if(target < nums[mid]){
                r = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
