package lordy.nowcoder.huawei;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hj9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String s = in.nextLine();
            Queue<Character> queue = new LinkedList<>();
            for(int i = s.length() - 1; i >= 0; i--){
                if(!queue.contains(s.charAt(i))){
                    queue.offer(s.charAt(i));
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!queue.isEmpty()){
                sb.append(queue.poll());
            }
            System.out.println(sb);
        }
    }
}
