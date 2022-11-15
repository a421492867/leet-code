package lordy.nowcoder.huawei;


import java.util.Scanner;

public class Hj11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            String[] array = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = array.length - 1; i >= 0; i--){
                sb.append(array[i] + " ");
            }
            System.out.println(sb);
        }
    }
}
