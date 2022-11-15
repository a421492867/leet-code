package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] array = str.split(" ");
        System.out.println(array[array.length - 1].length());
    }
}
