package lordy.codetop.bytedance;

public class Leetcode59 {

    public int[][] generateMatrix(int n){
        int[][] res = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] visited = new boolean[n][n];
        int row = 0, col = 0;
        int directionIndex = 0;
        for(int i = 1; i <= n * n; i++){
            res[row][col] = i;
            visited[row][col] = true;
            int nextRow = row + directions[directionIndex][0], nextCol = col + directions[directionIndex][1];
            if(nextRow >= n || nextRow < 0 || nextCol >= n || nextCol < 0 || visited[nextRow][nextCol]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
        return res;
    }
}
