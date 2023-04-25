package lordy.everyday;


import java.util.Arrays;
import java.util.Collections;

public class Leetcode2418 {

    public String[] sortPeople(String[] names, int[] heights){
        int n = names.length;
        Integer[] indices = new Integer[n];
        for(int i = 0; i < n; i++){
            indices[i] = i;
        }
        Arrays.sort(indices, (o1, o2) -> heights[o2] - heights[o1]);
        String[] res = new String[n];
        for(int i = 0; i < n; i++){
            res[i] = names[indices[i]];
        }
        return res;

    }


}
