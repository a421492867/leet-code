package lordy.search;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No.417
 */
//TODO
public class PacificAtlanticWaterFlow {

    public static List<List<Integer>> pacificAtlantic(int[][] heights){
        List<List<Integer>> res = new ArrayList<>();
        if(heights == null || heights.length == 0) return res;
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] canPacific = new boolean[m][n];
        boolean[][] canAtlantic = new boolean[m][n];
        for(int i = 0; i < m; i++){
            dfs(i, 0, canPacific, heights, heights[i][0]);
            dfs(i, n - 1, canAtlantic, heights, heights[i][n - 1]);
        }
        for(int j = 0; j < n; j++){
            dfs(0, j, canPacific, heights, heights[0][j]);
            dfs(m - 1, j, canAtlantic, heights, heights[m - 1][j]);
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(canPacific[i][j] && canAtlantic[i][j]){
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    public static void dfs(int i, int j, boolean[][] visited, int[][] heights, int pre){
        if(i < 0 || j < 0 || i >= heights.length || j >= heights[0].length || visited[i][j] || heights[i][j] < pre) return;
        visited[i][j] = true;
        dfs(i + 1, j, visited, heights, heights[i][j]);
        dfs(i - 1, j, visited, heights, heights[i][j]);
        dfs(i, j + 1, visited, heights, heights[i][j]);
        dfs(i, j - 1, visited, heights, heights[i][j]);

    }

    public static void main(String[] args) {
        int[][] height = {{1,2,2,3,5},{3,2,3,4,4}, {2,4,5,3,1}, {6,7,1,4,5},{5,1,1,2,4}};
        System.out.println(JSON.toJSONString(pacificAtlantic(height)));
    }
}
