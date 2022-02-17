package lordy.structure.array;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

/**
 * No.240
 */
public class SearchA2DMatrix2 {

    public static boolean searchMatrix(int[][] matrix, int target){

        int begin = matrix[0][0];
        if(target < begin) return false;
        int row = matrix.length, col = matrix[0].length;
        for(int i = 0; i < row; i++){
            if(binarySearch(matrix[i], target)){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int target){
        int low = 0, high = nums.length - 1, mid;
        while (low <= high){
            mid = (low + high) / 2;
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}
