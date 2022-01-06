package lordy.search;

import java.util.ArrayList;
import java.util.List;

/**
 * No.934
 */
//todo 使用队列
public class ShortestBridge {

    public static int bridge(int[][] grid){
        int m = grid.length;
        boolean[][] visited = new boolean[m][m];
        boolean flag = true;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    //至少执行了一遍dfs 至少发现一个图
                    flag = false;
                    dfs(i, j, grid, visited);
                    break;
                }
            }
            //发现一个图就跳出
            if(!flag) break;

        }



        return bfs(grid);
    }

    public static int bfs(int[][] grid){
        int m = grid.length;
        int res = 0;
        //记录当前要扩的点
        int pointNum = 2;
        while (true){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    if(grid[i][j] == pointNum){
                        if(i > 0){
                            if(grid[i - 1][j] == 1) return res;
                            if(grid[i - 1][j] == 0) grid[i - 1][j] = pointNum + 1;
                        }
                        if(i < m - 1){
                            if(grid[i + 1][j] == 1) return res;
                            if(grid[i + 1][j] == 0) grid[i + 1][j] = pointNum + 1;
                        }
                        if(j > 0){
                            if(grid[i][j - 1] == 1) return res;
                            if(grid[i][j - 1] == 0) grid[i][j - 1] = pointNum + 1;
                        }
                        if(j < m - 1){
                            if(grid[i][j + 1] == 1) return res;
                            if(grid[i][j + 1] == 0) grid[i][j + 1] = pointNum + 1;
                        }

                    }

                }

        }
            //一次完全扩之后 扩下一个点
            res++;
            pointNum++;
        }
    }


    public static void dfs(int i, int j, int[][] grid, boolean[][] visited){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid.length || visited[i][j]) return;
        visited[i][j] = true;
        grid[i][j] = 2;
        if(i + 1 < grid.length && grid[i + 1][j] == 1) dfs(i + 1, j, grid, visited);
        if(i - 1 >= 0 && grid[i - 1][j] == 1)  dfs(i - 1, j , grid, visited);
        if(j + 1 < grid.length && grid[i][j + 1] == 1) dfs(i, j + 1, grid, visited);
        if(j - 1 >= 0 && grid[i][j - 1] == 1) dfs(i, j - 1, grid, visited);
    }


    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0,0,0}, {0,1,0,0,0,0},{1,1,0,0,0,0},{1,1,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,0,0}};
        System.out.println(bridge(grid));
    }
}
