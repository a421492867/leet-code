package lordy.exercise;

import java.util.ArrayList;
import java.util.List;

public class Leetcode60 {

    public String getPermutation(int n, int k) {
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            dfs(n, list, res);
        }

        return res.get(k - 1);

    }

    public void dfs(int n, List<Integer> cur, List<String> res){
        if(cur.size() == n){
            long r = 0;
            for(int i : cur){
                r = r * 10 + i;
            }
            res.add(String.valueOf(r));
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!cur.contains(i)){
                cur.add(i);
                dfs(n, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode60 l = new Leetcode60();
        int n = 3, k = 3;
        l.getPermutation(n, k);
    }
}
