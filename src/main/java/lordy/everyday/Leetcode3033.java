package lordy.everyday;

public class Leetcode3033 {

    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int j = 0; j < m; j++) {
            int zd = -1;
            for (int i = 0; i < n; i++) {
                zd = Math.max(zd, matrix[i][j]);
            }
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = zd;
                }
            }
        }
        return matrix;

    }
}
