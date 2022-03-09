package lordy.hot100;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Leetcode406 {

    public int[][] reconstructQueue(int[][] people){
        Arrays.sort(people, ((o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        List<int[]> list = new LinkedList<>();
        for(int[] i : people){
            list.add(i[1], i);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
