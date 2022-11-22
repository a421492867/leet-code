package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix){
        int[][] direction = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};

        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int directionIndex = 0;
        int row = 0, col = 0;
        for(int i = 0; i < m * n; i++){
            res.add(matrix[row][col]);
            visited[row][col] = true;

            int nextRow = row + direction[directionIndex][0], nextCol = col + direction[directionIndex][1];
            if(nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += direction[directionIndex][0];
            col += direction[directionIndex][1];
        }
        return res;
    }
}
