package lordy.search;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No.51
 * 每一行、列、左斜、右斜最多只有一个皇后
 */
//TODO
public class NQueens {

    public static List<List<String>> solveNQueens(int n){
        return null;
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
        if(i - 1 >= 0 && j - 1 >= 0){
            if(!".".equals(arr[i - 1][j - 1])){
                return false;
            }
        }

        //右上
        if(i - 1 >= 0 && j + 1 < arr.length){
            if(!".".equals(arr[i - 1][j + 1])){
                return false;
            }
        }

        //左下
        if(i + 1 < arr.length && j - 1 >= 0){
            if(!".".equals(arr[i + 1][j - 1])){
                return false;
            }
        }

        //右下
        if(i + 1 < arr.length && j + 1 < arr.length){
            if(!"".equals(arr[i + 1][j + 1])){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(JSON.toJSONString(solveNQueens(4)));
    }
}
