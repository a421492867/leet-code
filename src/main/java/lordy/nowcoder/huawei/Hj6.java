package lordy.nowcoder.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hj6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int num = in.nextInt();
            List<Integer> list = new ArrayList<>();
            while (num % 2 == 0){
                list.add(2);
                num = num / 2;
            }
            int sqrt = (int) Math.sqrt(num);
            for(int i = 3; i <= sqrt && i <= num; i += 2){
                while (num % i == 0){
                    list.add(i);
                    num /= i;
                }
            }
            if(num != 1){
                list.add(num);
            }

            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(Integer i : list){
                sb.append(i + " ");
            }
            System.out.println(sb);

        }
    }
}
