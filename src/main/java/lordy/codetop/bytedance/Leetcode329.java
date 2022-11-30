package lordy.codetop.bytedance;

import java.util.Arrays;

public class Leetcode329 {

    public int longestIncreasingPtah(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            for (int j =0; j < n; j++){
                res = Math.max(res, dfs(matrix, i, j, dp, Integer.MIN_VALUE, visited));
            }
        }
        return res;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] dp, int lastNum, boolean[][] visited){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= lastNum || visited[i][j]){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int res = 1;
        visited[i][j] = true;
        res = Math.max(res, dfs(matrix, i + 1, j, dp, matrix[i][j], visited) + 1);
        res = Math.max(res, dfs(matrix, i - 1, j, dp, matrix[i][j], visited) + 1);
        res = Math.max(res, dfs(matrix, i, j + 1, dp, matrix[i][j], visited) + 1);
        res = Math.max(res, dfs(matrix, i, j - 1, dp, matrix[i][j], visited) + 1);
        dp[i][j] = res;
        visited[i][j] = false;
        return res;
    }

//    private int res = Integer.MIN_VALUE;
//    public int longestIncreasingPath(int[][] matrix){
//
//        int m = matrix.length, n = matrix[0].length;
//        boolean[][] visited = new boolean[m][n];
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                visited[i][j] = true;
//                dfs(matrix, visited, i + 1, j, 1, matrix[i][j]);
//                dfs(matrix, visited, i - 1, j, 1, matrix[i][j]);
//                dfs(matrix, visited, i, j + 1, 1, matrix[i][j]);
//                dfs(matrix, visited, i, j - 1, 1, matrix[i][j]);
//                visited[i][j] = false;
//            }
//        }
//        return res;
//    }
//
//    private void dfs(int[][] matrix, boolean[][] visited, int i, int j, int max, int lastNum){
//        res = Math.max(res, max);
//        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j] || matrix[i][j] <= lastNum){
//            return;
//        }
//        visited[i][j] = true;
//        dfs(matrix, visited, i + 1, j, max + 1, matrix[i][j]);
//        dfs(matrix, visited, i - 1, j, max + 1, matrix[i][j]);
//        dfs(matrix, visited, i, j + 1, max + 1, matrix[i][j]);
//        dfs(matrix, visited, i, j - 1, max + 1, matrix[i][j]);
//        visited[i][j] = false;
//    }
}
