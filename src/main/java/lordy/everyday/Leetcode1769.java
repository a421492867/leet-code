package lordy.everyday;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1769 {

    public int[] minOperations(String boxes){
        char[] array = boxes.toCharArray();
        int n = array.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(array[i] == '1'){
                list.add(i);
            }
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j : list){
                if(j != i){
                    sum += Math.abs(j - i);
                }
            }
            res[i] = sum;
        }
        return res;
    }
}
