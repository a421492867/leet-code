package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj46 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.next();
            int length = in.nextInt();
            System.out.println(s.substring(0, length));
        }
    }
}
