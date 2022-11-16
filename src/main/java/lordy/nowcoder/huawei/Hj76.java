package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj76 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int b = a * a - a + 1;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < a; i++){
                sb.append(b).append("+");
                b += 2;
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
