package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj106 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i = s.length() - 1; i >= 0; i--){
                sb.append(s.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
