package lordy.nowcoder.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Hj60 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int[] result = new int[2];
            int differ = Integer.MAX_VALUE;
            for(int i = 1; i < num; i++){
                int other = num - i;
                if(isPrime(i) && isPrime(other)){
                    if(Math.abs(i - other) < differ){
                        result[0] = i;
                        result[1] = other;
                        differ = Math.abs(i - other);
                    }
                }
            }
            Arrays.sort(result);
            for(int i = 0; i < 2; i++){
                System.out.println(result[i]);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num <= 3){
            return true;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
