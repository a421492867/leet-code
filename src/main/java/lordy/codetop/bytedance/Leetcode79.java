package lordy.codetop.bytedance;

public class Leetcode79 {

    public boolean exist(char[][] board, String word){
        int m = board.length, n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean res = dfs(board, i, j, word, 0, visited);
                    if(res) return res;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index, boolean[][] visited){
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]){
            return false;
        }
        if(board[i][j] == word.charAt(index)){
            visited[i][j] = true;
            boolean res = dfs(board, i + 1, j, word, index + 1, visited)
                    || dfs(board, i - 1, j, word, index + 1, visited)
                    || dfs(board, i, j + 1, word, index + 1, visited)
                    || dfs(board, i, j - 1, word, index + 1, visited);
            visited[i][j] = false;
            return res;
        }else {
            return false;
        }

    }
}
