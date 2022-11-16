package lordy.nowcoder.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Hj58 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String[] s1Array = s1.split(" ");
            int n = Integer.valueOf(s1Array[0]);
            int k = Integer.valueOf(s1Array[1]);

            String[] s2Array = s2.split(" ");
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = Integer.valueOf(s2Array[i]);
            }
            Arrays.sort(array);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < k; i++){
                sb.append(array[i] + " ");
            }
            System.out.println(sb);
        }
    }
}
