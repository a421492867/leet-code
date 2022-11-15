package lordy.nowcoder.huawei;

import java.util.Scanner;

public class Hj7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String num = in.nextLine();
            String[] array = num.split("\\.");
            if(array.length == 1){
                System.out.println(Integer.valueOf(num));
            }else {
                if(array[1].charAt(0) - '0' < 5){
                    System.out.println(Integer.valueOf(array[0]));
                }else {
                    System.out.println(Integer.parseInt(array[0]) + 1);
                }
            }

        }
    }
}
