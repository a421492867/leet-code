package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            String s = Integer.toBinaryString(num);
            System.out.println(s.replace("0", "").length());
        }
    }
}
