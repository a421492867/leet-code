package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toUpperCase();
        char c = in.next().toUpperCase().charAt(0);
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(c == s.charAt(i)){
                res++;
            }
        }
        System.out.println(res);
    }
}
