package lordy.search;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No.51
 * 每一行、列、左斜、右斜最多只有一个皇后
 */
public class NQueens {

    public static List<List<String>> solveNQueens(int n){
        String[][] arr = new String[n][n];
        for(String[] str : arr){
            Arrays.fill(str, ".");
        }
        List<String> list = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();

        backtrack(0, list, res, arr);
        return res;
    }

    public static void backtrack(int row, List<String> list, List<List<String>> res, String[][] arr){
        if(list.size() == arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        if(row < 0 || row >= arr.length) return;
        for(int col = 0; col < arr.length; col++){
            if(isValid(row, col, arr)){
                arr[row][col] = "Q";
                list.add(arr2List(arr[row]));
                backtrack(row + 1, list, res, arr);
                arr[row][col] = ".";
                list.remove(list.size() - 1);
            }
        }
    }

    public static String arr2List(String[] arr){
        StringBuffer sb = new StringBuffer();
        for(String s : arr){
            sb.append(s);
        }
        return sb.toString();
    }


    public static boolean isValid(int i, int j, String[][] arr){

        //行
        for(int row = 0; row < arr.length; row++){
            if(!".".equals(arr[i][row])){
                return false;
            }
        }

        //列
        for(int col = 0; col < arr.length; col++){
            if(!".".equals(arr[col][j])){
                return false;
            }
        }

        //左上
        for(int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--,col--){
            if(!".".equals(arr[row][col])){
                return false;
            }
        }
//        if(i - 1 >= 0 && j - 1 >= 0){
//            if(!".".equals(arr[i - 1][j - 1])){
//                return false;
//            }
//        }

        //右上
        for(int row = i - 1 , col = j + 1; row >= 0 && col < arr.length; row--, col++){
            if(!".".equals(arr[row][col])){
                return false;
            }
        }
//        if(i - 1 >= 0 && j + 1 < arr.length){
//            if(!".".equals(arr[i - 1][j + 1])){
//                return false;
//            }
//        }

        //左下
        for(int row = i + 1, col = j - 1; row < arr.length && col >= 0; row++, col--){
            if(!".".equals(arr[row][col])){
                return false;
            }
        }
//        if(i + 1 < arr.length && j - 1 >= 0){
//            if(!".".equals(arr[i + 1][j - 1])){
//                return false;
//            }
//        }

        //右下
        for(int row = i + 1, col = j + 1; row < arr.length && col < arr.length; row++, col++){
            if(!".".equals(arr[row][col])){
                return false;
            }
        }
//        if(i + 1 < arr.length && j + 1 < arr.length){
//            if(!".".equals(arr[i + 1][j + 1])){
//                return false;
//            }
//        }
        return true;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(JSON.toJSONString(solveNQueens(n)));
    }
}
