package lordy.everyday;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode2611 {

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        Integer[] diff = new Integer[n];
        for(int i = 0; i < n; i++){
            diff[i] = i;
        }
        Arrays.sort(diff, (o1, o2) -> {return (reward1[o2] - reward2[o2]) - (reward1[o1] - reward2[o1]);});
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans += reward1[diff[i]];
        }
        for(int i = k; i < n; i++){
            ans += reward2[diff[i]];
        }
        return ans;

    }

    public static void main(String[] args) {
        Leetcode2611 l = new Leetcode2611();
        l.miceAndCheese(new int[]{1,1,3,4}, new int[]{4,4,1,1}, 2);
    }
}
