package lordy.exercise;

public class Leetcode806 {

    public int[] numberOfLines(int[] widths, String s){
        int n = s.length();
        char[] chars = s.toCharArray();
        int res = 1;
        int wid = 0;
        int cur = 0;
        for(int i = 0; i < n; i++){
            char c = chars[i];
            int unit = widths[c - 'a'];
            if(cur + unit > 100){
                res++;
                wid = unit;
                cur = unit;

            }else{
                wid += unit;
                cur += unit;
            }
        }

        return new int[]{res, wid};
    }
}
