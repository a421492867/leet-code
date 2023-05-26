package lordy.everyday;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class Leetcode1091 {

    public int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;
        if(grid[0][0] != 0) return -1;
       int[][] dp = new int[n][n];
       for(int i = 0; i < n; i++){
           Arrays.fill(dp[i], Integer.MAX_VALUE);
       }
       dp[0][0] = 1;
       Queue<int[]> queue = new LinkedList<>();
       int[][] direction = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
       //bfs
       queue.offer(new int[]{0,0});
       while (!queue.isEmpty()){
           int[] cur = queue.poll();
           int x = cur[0];
           int y = cur[1];
           for(int[] dir : direction){
               int nextX = dir[0] + x;
               int nextY = dir[1] + y;
               if(check(nextX, nextY, grid)){
                    if(dp[nextX][nextY] == Integer.MAX_VALUE) queue.offer(new int[]{nextX, nextY});
                    dp[nextX][nextY] = Math.min(dp[nextX][nextY], dp[x][y] + 1);
               }
           }
       }
       return dp[n - 1][n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1][n - 1];

    }

    private boolean check(int x, int y, int[][] grid){
        int n = grid.length;
        if(x < 0 || x >= n || y < 0 || y >= n || grid[x][y] != 0) return false;
        return true;
    }
}
