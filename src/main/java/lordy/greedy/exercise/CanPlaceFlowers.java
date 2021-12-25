package lordy.greedy.exercise;

import java.util.Arrays;

/**
 * No.605
 */
public class CanPlaceFlowers {

    public static boolean canPlace(int[] flowerbed, int n){
        int[] temp = new int[flowerbed.length + 2];
        Arrays.fill(temp, 0);
        System.arraycopy(flowerbed, 0, temp, 1, flowerbed.length);
        for(int i = 1; i < temp.length - 1; i++){
            if(temp[i - 1] == 0 && temp[i] == 0 && temp[i + 1] == 0){
                temp[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlace(flowerbed, n));
    }
}
