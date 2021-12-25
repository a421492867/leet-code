package lordy.greedy;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * No.135
 */
public class Candy {

    public static int minCandy(int[] ratings){
        int[] temp = new int[ratings.length];
        Arrays.fill(temp, 1);
        for(int i = 0; i < ratings.length - 1; i++){
            if(ratings[i + 1] > ratings[i]){
                temp[i + 1] = temp[i] + 1;
            }
        }
        for(int i = ratings.length - 1; i > 0; i--){
            if(ratings[i - 1] > ratings[i]){
                if(temp[i - 1] <= temp[i]){
                    temp[i - 1] = temp[i] + 1;
                }
            }
        }
        return Arrays.stream(temp).sum();
    }

    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        System.out.println(minCandy(ratings));
    }

}
