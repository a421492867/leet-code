package lordy.hot100;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {

    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int total = rows * cols;
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1, 0}};
        int directionIndex = 0;
        int row = 0, col = 0;
        for(int i = 0; i < total; i++){
            res.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[directionIndex][0], nextCol = col + directions[directionIndex][1];
            if(nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
        return res;
    }
}
