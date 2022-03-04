package lordy.hot100;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode3 {

    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        if(n == 0){
            return 0;
        }
        int res = 0;
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(!queue.contains(s.charAt(i))){
                queue.offer(s.charAt(i));
            }else {
                res = Math.max(res, queue.size());
                while (!queue.isEmpty()){
                    Character c = queue.poll();
                    if(c == s.charAt(i)){
                        queue.offer(c);
                        break;
                    }
                }
            }
        }
        return Math.max(queue.size(), res);
    }
}
