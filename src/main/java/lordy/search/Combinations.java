package lordy.search;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * No.77
 */
public class Combinations {

    public static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(1, res, list, n, k);

        return res;
    }

    //定义startIndex是保证不重复  不必向前再找 因为前边的已经包括  比如含有{1,2} 就不需要含有{2,1}
    public static void backtrack(int startIndex ,List<List<Integer>> res, List<Integer> list, int n, int k){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = startIndex; i <= n; i++){
            if(!list.contains(i)){
                int start = i + 1;
                list.add(i);
                backtrack(start, res, list, n, k);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(combine(4, 2)));
    }
}
