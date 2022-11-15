package lordy.nowcoder.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hj14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextLine());
        }
        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }
    }
}
