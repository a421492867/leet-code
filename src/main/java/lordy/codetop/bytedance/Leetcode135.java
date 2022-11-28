package lordy.codetop.bytedance;

import java.util.Arrays;

public class Leetcode135 {

    public int candy(int[] ratings){
        int n = ratings.length;
        int[] array = new int[n];
        Arrays.fill(array, 1);

        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]){
                array[i] = array[i - 1] + 1;
            }
        }

        for(int i = n - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1] && array[i] <= array[i + 1]){
                array[i] = array[i + 1] + 1;
            }
        }
        return Arrays.stream(array).sum();
    }
}
