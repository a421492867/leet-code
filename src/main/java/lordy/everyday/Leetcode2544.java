package lordy.everyday;

public class Leetcode2544 {

    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        char[] array = s.toCharArray();
        int res = 0;
        boolean flag = true;
        int len = array.length;
        for(int i = 0; i < len; i++){
            int num;
            if(flag){
                num = array[i] - '0';
            }else {
                num = -(array[i] - '0');
            }
            res += num;
            flag = !flag;
        }
        return res;
    }
}
