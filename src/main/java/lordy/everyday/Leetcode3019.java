package lordy.everyday;

import org.apache.commons.lang3.StringUtils;

public class Leetcode3019 {

    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int n = chars.length;
        if(n == 1) return 0;
        int count = 0;
        char pre = chars[0];
        for(int i = 1; i < n; i++){
            char cur = chars[i];
            if(cur != pre){
                pre = cur;
                count++;
            }
        }
        return count;
    }
}
