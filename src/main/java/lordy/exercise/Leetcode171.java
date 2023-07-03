package lordy.exercise;

public class Leetcode171 {

    public int titleToNumber(String columnTitle) {

        char[] array = columnTitle.toCharArray();
        int n = array.length;
        int res = 0;
        for(int i = n - 1; i >= 0; i--){
            char c = array[i];
            int num = c - 'A' + 1;
            res += Math.pow(26, (n - 1 - i)) * num;
        }
        return res;

    }
}
