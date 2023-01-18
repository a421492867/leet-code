package lordy.codetop.jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode204 {

    public int countPrimes(int n){
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        List<Integer> prime = new ArrayList<>();
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                prime.add(i);
            }
            for(Integer p : prime){
                if(i * p >= n) break;
                isPrime[i * p] = false;
            }
        }

        return prime.size();
    }
}
