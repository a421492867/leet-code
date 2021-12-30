package lordy.search;

/**
 * No.547
 */
//TODO
public class FriendCircles {

    public static int findCircleNum(int[][] isConnected){
        boolean[] visited = new boolean[isConnected.length];
        int result = 0;
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i]){
                dfs(isConnected, visited, i);
                result++;
            }
        }
        return result;
    }

    public static void dfs(int[][] isConnected, boolean[] visited, int i){
        for(int j = 0; j < isConnected.length; j++){
            if(isConnected[i][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }
}
