package lordy.hot100;

public class Leetcode14 {

    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++){
            String cur = strs[i];
            int p = 0, c = 0;
            while(p < pre.length() && c < cur.length() && pre.charAt(p) == cur.charAt(c)){
                p++;
                c++;
            }
            if(p < pre.length()){
                pre = pre.substring(0, p);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        Leetcode14 l = new Leetcode14();
        String[] strs = {"flower", "flow", "flight"};
        l.longestCommonPrefix(strs);
    }
}
