package lordy.exercise;

import java.util.Arrays;

public class Leetcode135 {

    public int candy(int[] ratings){
        int n = ratings.length;
        if(n < 2){
            return ratings.length;
        }
        int[] init = new int[n];
        for(int i = 0; i < n; i++){
            init[i] = 1;
        }

        for(int i = 0; i < n - 1; i++){
            if(ratings[i + 1] > ratings[i]){
                init[i + 1] = init[i] + 1;
            }
        }

        for(int i = n - 1; i > 0; i--){
            if(ratings[i - 1] > ratings[i]){
                if(init[i - 1] <= init[i]){
                    init[i - 1] = init[i] + 1;
                }
            }
        }
        return Arrays.stream(init).sum();
    }
}
