package lordy.everyday;

public class Leetcode2806 {

    public int accountBalanceAfterPurchase(int purchaseAmount) {

        int total = 100;

        int mod = purchaseAmount % 10;

        int i = purchaseAmount / 10;

        if(mod >= 5){
            total = total - (i + 1) * 10;
        }else {
            total = total - i * 10;
        }
        return total;

    }
}
