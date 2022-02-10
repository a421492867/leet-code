package lordy.divideandconquer.exercise;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * No.932
 */
public class BeautifulArray {

    private static Map<Integer, int[]> map = new HashMap<>();

    public static int[] beautifulArray(int n){
        f(n);
        return map.get(n);
    }

    public static int[] f(int n){
        if(map.get(n) != null){
            return map.get(n);
        }
        int[] ans = new int[n];
        if(n == 1){
            map.put(n, new int[]{1});
            return map.get(n);
        }

        int index = 0;
        for(int i : f((n + 1) / 2)){
            ans[index++] = i * 2 - 1;
        }
        for(int i : f(n / 2)){
            ans[index++] = i * 2;
        }
        map.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(JSON.toJSONString(beautifulArray(n)));
    }


}
