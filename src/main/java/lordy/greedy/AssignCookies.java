package lordy.greedy;

import java.util.Arrays;

/**
 * No.455
 */
public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s){
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length){
            if(g[child] <= s[cookie]){
                count++;
                child++;
            }
            cookie++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}
