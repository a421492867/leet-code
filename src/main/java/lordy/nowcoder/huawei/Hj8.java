package lordy.nowcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Hj8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int index = in.nextInt();
            int value = in.nextInt();
            map.put(index, map.getOrDefault(index, 0) + value);
        }
        for(Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
