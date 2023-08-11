package lordy.everyday;

public class Leetcode1572 {

    public int diagonalSum(int[][] mat){
        int n = mat.length;
        int x1 = 0, y1 = 0;
        int x2 = n - 1, y2 = 0;
        int res = 0;
        while (y1 < n){
            int a = mat[x1][y1];
            int b = mat[x2][y2];
            if(x1 == x2 && y1 == y2){
                res += a;
            }else{
                res = res + a + b;
            }
            x1++;
            y1++;
            x2--;
            y2++;
        }
        return res;
    }
}
