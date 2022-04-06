package lordy.exercise;

public class Leetcode74 {

    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length, n = matrix[0].length;
        if(matrix[0][0] > target) return false;
        int rowL = 0, rowR = m, mid = -1;
        while(rowL < rowR){
            mid = rowL + rowR >> 1;
            if(matrix[mid][0] > target){
                rowR = mid;
            }else if(matrix[mid][n - 1] < target){
                rowL = mid + 1;
            }else{
                break;
            }
        }
        int[] arr = matrix[mid];
        if(arr[0] > target || arr[n - 1] < target){
            return false;
        }
        int l = 0, r = n;
        while(l < r){
            int mi = l + r >> 1;
            if(arr[mi] == target){
                return true;
            }else if(arr[mi] > target){
                r = mi;
            }else {
                l = mi + 1;
            }
        }

        return false;
    }
}
