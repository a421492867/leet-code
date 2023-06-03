package lordy.exercise;

public class Leetcode12 {

    private int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private String[] roma = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            String roman = roma[i];
            while (num >= val){
                num -= val;
                sb.append(roman);
            }
            if(num == 0) break;
        }
        return sb.toString();

    }
}
