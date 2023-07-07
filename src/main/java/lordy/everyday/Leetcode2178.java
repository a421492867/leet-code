package lordy.everyday;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2178 {

    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<>();
        if(finalSum % 2 == 1) return list;
        long i = 2;
        while (finalSum - i >= 0){
            list.add(i);
            finalSum -= i;
            i += 2;
        }
        list.set(list.size() - 1, list.get(list.size() - 1) + finalSum);
        return list;
    }
}
