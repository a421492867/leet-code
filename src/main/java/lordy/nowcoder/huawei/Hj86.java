package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj86 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            System.out.println(helper(n));
        }
    }

    public static int helper(int n){
        String s = Integer.toBinaryString(n);
        int res = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                cur++;
            }else {
                res = Math.max(res, cur);
                cur = 0;
            }
        }
        res = Math.max(res, cur);
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}
