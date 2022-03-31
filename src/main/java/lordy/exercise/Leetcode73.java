package lordy.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode73 {

    public void setZeroes(int[][] matrix) {
        List<Integer> needRow = new ArrayList<>();
        List<Integer> needCol = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    needRow.add(i);
                    needCol.add(j);
                }
            }
        }
        for(int row : needRow){
            for(int i = 0; i < n; i++){
                matrix[row][i] = 0;
            }
        }
        for(int col : needCol){
            for(int i = 0; i < m; i++){
                matrix[i][col] = 0;
            }
        }

    }
}
