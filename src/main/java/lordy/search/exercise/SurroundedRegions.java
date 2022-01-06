package lordy.search.exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No.130
 */
public class SurroundedRegions {


    public static void solve(char[][] board){
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        int boaderO = 0;
        for(int j = 0; j < col; j++){
            if(board[0][j] == 'O'){
                board[0][j] = 'N';
                boaderO++;
            }
            if(board[row - 1][j] == 'O'){
                board[row - 1][j] = 'N';
                boaderO++;
            }
        }

        for(int i = 1; i < row - 1; i++){
            if(board[i][0] == 'O'){
                board[i][0] = 'N';
                boaderO++;
            }
            if(board[i][col - 1] == 'O'){
                board[i][col - 1] = 'N';
                boaderO++;
            }
        }
        if(boaderO == 0){
            for(int i = 0; i < row; i++){
                Arrays.fill(board[i], 'X');
            }
        }else {
            //边界有O
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    dfs(i, j, board, visited);
                }
            }
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    if(board[i][j] != 'N'){
                        board[i][j] = 'X';
                    }else {
                        board[i][j] = 'O';
                    }
                }
            }
        }



    }

    public static void dfs(int x, int y, char[][] board, boolean[][] visited){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y]) return;
        if(board[x][y] == 'N'){
            visited[x][y] = true;
            if(x > 0 && board[x - 1][y] == 'O') board[x - 1][y] = 'N'; dfs(x - 1, y, board, visited);
            if(x < board.length - 1 && board[x + 1][y] == 'O') board[x + 1][y] = 'N'; dfs(x + 1, y, board, visited);
            if(y > 0 && board[x][y - 1] == 'O') board[x][y - 1] = 'N'; dfs(x, y - 1, board, visited);
            if(y < board[0].length - 1 && board[x][y + 1] == 'O') board[x][y + 1] = 'N'; dfs(x, y + 1, board, visited);
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'O','O'}, {'O','O'},{'O','O'}};
        solve(board);
    }
}
