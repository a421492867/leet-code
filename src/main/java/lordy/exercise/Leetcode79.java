package lordy.exercise;

public class Leetcode79 {

    public boolean exist(char[][] board, String word){
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i, j, board, visited, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, boolean[][] visited, String word, int index){
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return false;
        if(board[i][j] == word.charAt(index)){
            visited[i][j] = true;
            boolean b = dfs(i + 1, j, board, visited, word, index + 1) || dfs(i - 1, j, board, visited, word, index + 1)
                    || dfs(i, j - 1, board, visited, word, index + 1) || dfs(i, j + 1, board, visited, word, index + 1);
            visited[i][j] = false;
            return b;
        }else {
            return false;
        }
    }
}
