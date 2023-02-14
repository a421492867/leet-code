package lordy.everyday;

import java.util.ArrayDeque;
import java.util.Deque;


public class Leetcode1124 {

    public int longestWPI(int[] hours){
        int n = hours.length;
        int[] s = new int[n + 1];
        Deque<Integer> stk = new ArrayDeque<Integer>();
        stk.push(0);
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
            if (s[stk.peek()] > s[i]) {
                stk.push(i);
            }
        }
        int res = 0;
        for (int r = n; r >= 1; r--) {
            while (!stk.isEmpty() && s[stk.peek()] < s[r]) {
                res = Math.max(res, r - stk.pop());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode1124 l = new Leetcode1124();
        int[] hours = {9,9,6,0,6,6,9};
        l.longestWPI(hours);
    }
}
