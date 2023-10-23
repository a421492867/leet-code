package lordy.everyday;

public class Leetcode2678 {

    public int countSeniors(String[] details) {
        int n = details.length;
        int res = 0;

        for(int i = 0; i < n; i++){
            String detail = details[i];
            char[] chars = detail.toCharArray();
            int j = chars[11] - '0';
            int k = chars[12] - '0';
            if(10 * j + k > 60){
                res++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode2678 l = new Leetcode2678();
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        l.countSeniors(details);
    }
}
