package lordy.structure.array;

import com.alibaba.fastjson.JSON;

/**
 * No.48
 */
public class RotateImage {

    public static void rotate(int[][] matrix){

        //顺时针90度相当于 水平调换 在 对角线互换

        int row = matrix.length, col = matrix[0].length;

        for(int i = 0; i < row / 2; i++){
            for(int j = 0; j < col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - i - 1][j];
                matrix[row - i - 1][j] = temp;
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(JSON.toJSONString(matrix));
    }
}
