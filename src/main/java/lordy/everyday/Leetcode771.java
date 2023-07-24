package lordy.everyday;

import java.util.HashSet;
import java.util.Set;

public class Leetcode771 {

    public int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : chars){
            set.add(c);
        }

        int n = stones.length();
        int res = 0;
        for(int i = 0; i < n; i++){
            char c = stones.charAt(i);
            if(set.contains(c)){
                res++;
            }
        }
        return res;
    }
}
