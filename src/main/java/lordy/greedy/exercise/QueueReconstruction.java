package lordy.greedy.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * No.406
 */

//TODO
public class QueueReconstruction {

    public static int[][] reconstructQueue(int[][] people){

        Arrays.sort(people, ((o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else {
                return o2[0] - o1[0];
            }
        }));
//        for(int[] s : people){
//            System.out.println(s[0] + " , " + s[1]);
//        }

        LinkedList<int[]> list = new LinkedList<>();
        for(int[] i : people){
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }

    public static void main(String[] args) {
        int[][] people = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        reconstructQueue(people);
    }
}
