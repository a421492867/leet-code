package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Offer62 {

    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int j = (m - 1) % n;
        while (list.size() > 1){
            list.remove(j);
            j = (j + m - 1) % list.size();
        }
        return list.get(0);
    }
}
