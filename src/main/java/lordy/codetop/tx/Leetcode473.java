package lordy.codetop.tx;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Leetcode473 {

    public boolean makesquare(int[] matchsticks){
        if(matchsticks.length < 4) return false;
        int sum = Arrays.stream(matchsticks).sum();
        if(sum % 4 != 0) return false;
        int width = sum / 4;
        Arrays.sort(matchsticks);
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }


        int[] array = new int[4];
        for(int i = 0; i < 4; i++){
            array[i] = width;
        }
        return dfs(matchsticks, 0, array);
    }

    private boolean dfs(int[] matchsticks, int i, int[] array){
        if(i == matchsticks.length){
            for (int j = 0; j < array.length; j++){
                if (array[j] != 0) return false;
            }
            return true;
        }
        int curLen = matchsticks[i];
        //boolean res = false;
        for(int j = 0; j < array.length; j++){
            array[j] -= curLen;
            if(array[j] >= 0){
                if(dfs(matchsticks, i + 1, array)){
                    return true;
                }
            }
            array[j] += curLen;
        }
        return false;
    }
}
