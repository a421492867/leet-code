package lordy.everyday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode970 {

    public List<Integer> powerfulIntegers(int x, int y, int bound){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <=20; i++){
            for(int j = 0; j <= 20; j++){
                long res = (long) (Math.pow(x, i) + Math.pow(y, j));
                if(res <= bound && !set.contains(res)){
                    set.add((int) res);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
