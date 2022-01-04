package lordy.search;

/**
 * No.79
 */
public class WordSearch {

    public static boolean exist(char[][] board, String word){
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

    public static boolean dfs(int i, int j, char[][] board, boolean[][] visited, String word, int charIndex){
        if(charIndex == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return false;
        if(board[i][j] == word.charAt(charIndex)){
            visited[i][j] = true;
            boolean b = dfs(i + 1, j, board, visited, word, charIndex + 1) || dfs(i - 1, j, board, visited, word, charIndex + 1)
                    || dfs(i, j - 1, board, visited, word, charIndex + 1) || dfs(i, j + 1, board, visited, word, charIndex + 1);
            visited[i][j] = false;
            return b;
        }else {
            return false;
        }
    }



    public static void main(String[] args) {
        char[][] chars = {{'a'}};
        String word = "a";
        System.out.println(exist(chars, word));
    }

}
