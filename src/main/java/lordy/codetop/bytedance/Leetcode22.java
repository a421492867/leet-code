package lordy.codetop.bytedance;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {

    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack(n, 0, 0, res, new StringBuilder());
        return res;
    }

    private void backtrack(int n, int l, int r, List<String> res, StringBuilder sb){
        if(sb.length() == 2 * n){
            res.add(sb.toString());
            return;
        }
        if(l < n){
            sb.append("(");
            backtrack(n, l + 1, r, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(r < l){
            sb.append(")");
            backtrack(n, l, r + 1, res, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
