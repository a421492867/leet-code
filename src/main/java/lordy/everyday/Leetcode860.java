package lordy.everyday;

public class Leetcode860 {

    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        if(bills[0] > 5) return false;
        int five = 0, ten = 0;
        for(int i = 0; i < n; i++){
            if(bills[i] == 5) five++;
            else if(bills[i] == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }else {
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
