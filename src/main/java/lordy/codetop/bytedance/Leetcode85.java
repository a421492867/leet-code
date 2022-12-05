package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode85 {

    public int maximalRectangle(char[][] matrix){

        int m = matrix.length, n = matrix[0].length;

        int[][] array = new int[m][n + 1];
        for(int i = 0; i < n; i++){
            array[0][i] = matrix[0][i] - '0';
        }
        for(int i = 0; i < m; i++){
            array[i][n] = Integer.MIN_VALUE;
        }
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = matrix[i][j] == '0' ? 0 : array[i - 1][j] + 1;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int[] arr : array){
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for(int i = 0; i < arr.length; i++){
                while (stack.peek() != -1 && arr[i] <= arr[stack.peek()]){
                    int width = arr[stack.pop()];
                    int length = i - stack.peek() - 1;
                    max = Math.max(width * length, max);
                }
                stack.push(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,0,1,0,0}, {1,0,1,1,1}, {1,1,1,1,1}, {1,0,0,1,0}};
//        Leetcode85 l = new Leetcode85();
//        System.out.println(l.maximalRectangle(matrix));
    }
}
