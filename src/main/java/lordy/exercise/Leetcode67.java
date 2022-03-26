package lordy.exercise;

public class Leetcode67 {

    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length();
        if(m * n == 0){
            return m == 0 ? b : a;
        }
        int flag = 0;
        int aIndex = m - 1, bIndex = n - 1;
        StringBuilder sb = new StringBuilder();
        while(aIndex >= 0 || bIndex >= 0){
            int val1 = aIndex < 0 ? 0 : a.charAt(aIndex) - '0';
            int val2 = bIndex < 0 ? 0 : b.charAt(bIndex) - '0';
            int val = val1 + val2 + flag;
            flag = val / 2;
            sb.append(val % 2);
            aIndex--;
            bIndex--;
        }
        if(flag != 0){
            sb.append(flag);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Leetcode67 l = new Leetcode67();
        l.addBinary(a, b);
    }
}
