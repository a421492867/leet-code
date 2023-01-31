package lordy.codetop.tx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode994 {


    int color = 3;
    int res = 0;
    public int orangesRotting(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int[][] colorGrid = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2 && colorGrid[i][j] == 0){
                     dfs(grid, i, j, colorGrid, color);
                     color++;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && colorGrid[i][j] == 0){
                    return -1;
                }
            }
        }
        Queue<Integer[]>[] queues = new LinkedList[color - 3];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    int curColor = colorGrid[i][j];
                    colorGrid[i][j] = 0;
                    if(queues[curColor - 3] == null){
                        queues[curColor - 3] = new LinkedList<>();
                    }

                    queues[curColor - 3].offer(new Integer[]{i, j});
                }
            }
        }
        for(int i = 0; i < color - 3; i++){
            Queue<Integer[]> queue = queues[i];
            int result = -1;
            while (!queue.isEmpty()){
                int size = queue.size();
                for(int j = 0; j < size; j++){
                    Integer[] pairs = queue.poll();
                    int row = pairs[0];
                    int col = pairs[1];
                    //colorGrid[row][col] = 0;
                    if(row > 0 && colorGrid[row - 1][col] != 0 && grid[row - 1][col] != 0){
                        colorGrid[row - 1][col] = 0;
                        queue.offer(new Integer[]{row - 1, col});
                    }
                    if(row < m - 1 && colorGrid[row + 1][col] != 0 && grid[row + 1][col] != 0){
                        colorGrid[row + 1][col] = 0;
                        queue.offer(new Integer[]{row + 1, col});
                    }
                    if(col > 0 && colorGrid[row][col - 1] != 0 && grid[row][col - 1] != 0){
                        colorGrid[row][col - 1] = 0;
                        queue.offer(new Integer[]{row, col - 1});
                    }
                    if(col < n - 1 && colorGrid[row][col + 1] != 0 && grid[row][col + 1] != 0){
                        colorGrid[row][col + 1] = 0;
                        queue.offer(new Integer[]{row, col + 1});
                    }
                }
                result++;
            }
            res = Math.max(result, res) ;
        }
        return res;
    }

    private void dfs(int[][] grid, int i, int j, int[][] colorGrid, int color){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || colorGrid[i][j] > 2 || grid[i][j] == 0) return;
        colorGrid[i][j] = color;
        dfs(grid, i + 1, j, colorGrid, color);
        dfs(grid, i - 1, j, colorGrid, color);
        dfs(grid, i, j + 1, colorGrid, color);
        dfs(grid, i, j - 1, colorGrid, color);

    }

    public static void main(String[] args) {
        int[][] grid = {{0,2,2}};
        Leetcode994 l = new Leetcode994();
        l.orangesRotting(grid);
    }
}
