package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int res = n * 2 + n * (n - 1) / 2 * 3;
            System.out.println(res);
        }
    }
}
