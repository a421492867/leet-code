package lordy.exercise;

public class Leetcode2180 {

    public int countEven(int num){
        int res = 0;
        for(int i = 1; i <= num; i++){
            if(helper(i)){
                res++;
            }
        }
        return res;
    }


    private boolean helper(int num){
        String number = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < number.length(); i++){
            sum += number.charAt(i) - '0';
        }
        return sum % 2 == 0;
    }


    public static void main(String[] args) {
        Leetcode2180 l = new Leetcode2180();
        int res = l.countEven(30);
        System.out.println(res);
    }
}
