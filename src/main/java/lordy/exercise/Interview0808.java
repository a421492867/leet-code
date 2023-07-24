package lordy.exercise;

import java.util.HashSet;
import java.util.Set;

public class Interview0808 {

    public String[] permutation(String S) {
        char[] chars = S.toCharArray();
        int n = chars.length;
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[n];
        backtrack(chars,  set, sb, visited);
        String[] res = new String[set.size()];
        int i = 0;
        for(String str : set){
            res[i++] = str;
        }
        return res;
    }

    private void backtrack(char[] chars, Set<String> set, StringBuilder sb, boolean[] visited){
        if(sb.length() == chars.length){
            set.add(sb.toString());
            return;
        }
        for(int i = 0; i < chars.length; i++){
            if(!visited[i]){
                sb.append(chars[i]);
                visited[i] = true;
                backtrack(chars, set, sb, visited);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }

    }


}
