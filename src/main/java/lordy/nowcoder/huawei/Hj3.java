package lordy.nowcoder.huawei;

import java.util.*;
import java.util.stream.Collectors;

public class Hj3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < count; i++){
            set.add(in.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(Integer i : list){
            System.out.println(i);
        }

    }
}
