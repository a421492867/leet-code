package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj85 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            System.out.println(helper(s));
        }
    }

    public static int helper(String s){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            max = Math.max(len1, max);
            max = Math.max(len2, max);
        }
        return max;
    }

    public static int expand(String s, int l, int r){
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
