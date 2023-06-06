package lordy.everyday;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode2352 {

    public int equalPairs(int[][] grid){
        int n = grid.length;
        Map<Integer, List<Integer>> rows = new HashMap<>();
        Map<Integer, List<Integer>> cols = new HashMap<>();
        for(int i = 0; i < n; i++){
            List<Integer> rowList = new ArrayList<>();
            List<Integer> colList = new ArrayList<>();
            for(int j = 0; j < n; j++){
                rowList.add(grid[i][j]);
                colList.add(grid[j][i]);
            }
            rows.put(i, rowList);
            cols.put(i, colList);
        }
        int res = 0;
        for(Integer key : rows.keySet()){
            List<Integer> curRow = rows.get(key);
            for(Integer col : cols.keySet()){
                if(curRow.equals(cols.get(col))){
                    res++;
                }
            }
        }
        return res;
    }
}
