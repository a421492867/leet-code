package lordy.hot100;

/**
 * 排列组合
 */
public class Leetcode62 {

    public int uniquePaths(int m, int n) {
        long res = 1;
        for(int i = m, j = 1; j < n; i++, j++){
            res = res * i / j;
        }
        return (int) res;
    }



    public static void main(String[] args) {
        Leetcode62 l = new Leetcode62();
        int m = 23, n = 12;
        System.out.println(l.uniquePaths(m , n));
    }
}
