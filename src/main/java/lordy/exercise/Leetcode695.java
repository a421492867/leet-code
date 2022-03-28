package lordy.exercise;

public class Leetcode695 {

    public int maxAreaOfIsland(int[][] grid){
        int m = grid.length, n = grid[0].length;
        int max = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;

    }

    private int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        int result = 1;
        result += dfs(grid, i, j - 1);
        result += dfs(grid, i, j + 1);
        result += dfs(grid, i - 1, j);
        result += dfs(grid, i + 1, j);
        return result;
    }
}
