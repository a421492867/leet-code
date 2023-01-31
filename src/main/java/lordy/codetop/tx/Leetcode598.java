package lordy.codetop.tx;

public class Leetcode598 {

    public int maxCount(int m, int n, int[][] ops){
        int minRow = m, minCol = n;
        for(int[] op : ops){
            minRow = Math.min(op[0], minRow);
            minCol = Math.min(op[1], minCol);
        }
        return minCol * minRow;
    }
}
