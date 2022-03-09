package lordy.hot100;

public class Leetcode200 {

    public int numIslands(char[][] grid){
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    res++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return res;

    }

    public void dfs(char[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || visited[i][j]) return;
        visited[i][j] = true;
        dfs(grid, i + 1, j, visited);
        dfs(grid, i - 1, j, visited);
        dfs(grid, i, j - 1, visited);
        dfs(grid, i, j + 1, visited);

    }
}
