package lordy.everyday;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Leetcode2652 {

    public int sumOfMultiples(int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 3; i <= n; i++){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                set.add(i);
            }
        }
        int res = 0;
        for(Integer i : set){
            res += i;
        }
        return res;
    }
}
