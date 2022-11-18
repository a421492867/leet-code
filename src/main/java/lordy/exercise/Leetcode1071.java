package lordy.exercise;

public class Leetcode1071 {

    public String gcdOfStrings(String str1, String str2){

        if(!(str1 + str2).equals((str2 + str1))) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));

    }

    public int gcd(int a, int b){
        int mod = a % b;
        while (mod != 0){
            a = b;
            b = mod;
            mod = a % b;
        }
        return b;
    }
}
