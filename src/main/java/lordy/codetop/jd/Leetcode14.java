package lordy.codetop.jd;

public class Leetcode14 {

    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        String pre = strs[0];
        for(String s : strs){
            int l = 0, r = 0;
            while (l < pre.length() && r < s.length() && pre.charAt(l) == s.charAt(r)){
                l++;
                r++;
            }

            if(l < pre.length()){
                pre = pre.substring(0, l);
            }
        }
        return pre;
    }
}
