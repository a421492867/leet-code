package lordy.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * No.785
 */
public class IsGraphBipartite {

    private static boolean res = true;

    public static boolean isBipartite(int[][] graph){
        int n = graph.length;
        int[] color = new int[n];
        for(int i = 0; i < n && res; i++){
            if(color[i] == 0){
                dfs(i, 1, graph, color);
            }
        }
        return res;
    }

    public static void dfs(int cur, int curColor, int[][] graph, int[] color){
        color[cur] = curColor;
        for(int neighbor : graph[cur]){
            if(color[neighbor] == 0){
                dfs(neighbor, -curColor, graph, color);
            }else if(color[neighbor] != -curColor){
                res = false;
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{1}, {0,3}, {3}, {1,2}};
        System.out.println(isBipartite(graph));
    }
}
