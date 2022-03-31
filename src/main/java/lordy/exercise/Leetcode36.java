package lordy.exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode36 {

    public boolean isValidSudoku(char[][] board){
        Map<Integer, Set<Integer>> rowMap = new HashMap<>();
        Map<Integer, Set<Integer>> colMap = new HashMap<>();
        Map<Integer, Set<Integer>> areaMap = new HashMap<>();
        for(int i = 0; i < 9; i++){
            rowMap.put(i, new HashSet<>());
            colMap.put(i, new HashSet<>());
            areaMap.put(i, new HashSet<>());
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                int val = board[i][j] - '0';
                int areaIndex = i / 3 * 3 + j / 3;
                if(rowMap.get(i).contains(val) || colMap.get(j).contains(val)
                || areaMap.get(areaIndex).contains(val)) return false;
                rowMap.get(i).add(val);
                colMap.get(j).add(val);
                areaMap.get(areaIndex).add(val);
            }
        }
        return true;
    }
}
