package lordy.dynamicprogramming;

/**
 * No.542
 */
//TODO 正向和反向
public class Matrix {

    public static int[][] updateMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        // 第一次遍历，正向遍历，根据相邻左元素和上元素得出当前元素的对应结果
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = row + col;
                }
                if (i > 0) {
                    mat[i][j] = Math.min(mat[i][j], mat[i - 1][j] + 1);
                }
                if (j > 0) {
                    mat[i][j] = Math.min(mat[i][j], mat[i][j - 1] + 1);
                }
            }
        }
        // 第二次遍历，反向遍历，根据相邻右元素和下元素及当前元素的结果得出最终结果
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i < row - 1) {
                    mat[i][j] = Math.min(mat[i][j], mat[i + 1][j] + 1);
                }
                if (j < col - 1) {
                    mat[i][j] = Math.min(mat[i][j], mat[i][j + 1] + 1);
                }
            }
        }
        return mat;
    }


    public static void main(String[] args) {
        int[][] mat = {{1,0,1,1,0,0,1,0,0,1}, {0,1,1,0,1,0,1,0,1,1}, {0,0,1,0,1,0,0,1,0,0}, {1,0,1,0,1,1,1,1,1,1}, {0,1,0,1,1,0,0,0,0,1},
                {0,0,1,0,1,1,1,0,1,0},{0,1,0,1,0,1,0,0,1,1}, {1,0,0,0,1,1,1,1,0,1}, {1,1,1,1,1,1,1,0,1,0}, {1,1,1,1,0,1,0,0,1,1}};
        updateMatrix(mat);
    }
}
