package lordy.codetop.bytedance;

public class Leetcode415 {

    public String addStrings(String num1, String num2){
        int m = num1.length() - 1, n = num2.length() - 1;

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (m >= 0 || n >= 0){
            char n1 = m < 0 ? '0' : num1.charAt(m);
            char n2 = n < 0 ? '0' : num2.charAt(n);

            int res = (n1 - '0') + (n2 - '0') + carry;
            if(res >= 10){
                carry = res / 10;
                res = res % 10;
            }else {
                carry = res / 10;
            }
            sb.append(res);
            m--;
            n--;
        }
        if(carry > 0){
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Leetcode415 l = new Leetcode415();
        l.addStrings("1", "9");
    }
}
