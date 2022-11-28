package lordy.codetop.bytedance;

public class Leetcode48 {

    public void rotate(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        //水平
        for(int i = 0; i < m / 2; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - i - 1][j];
                matrix[m - i - 1][j] = temp;
            }
        }

        //对角线
        for(int i = 0; i < m; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
