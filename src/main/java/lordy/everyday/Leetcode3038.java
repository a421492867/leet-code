package lordy.everyday;

public class Leetcode3038 {

    public int maxOperations(int[] nums) {
        int n = nums.length;

        int temp = nums[0] + nums[1];
        int res = 1;
        int index = 2;
        while(index < n && index + 1 < n){
            int s = nums[index] + nums[index + 1];
            if(s == temp){
                res++;
                index += 2;
            }else {
                break;
            }
        }
        return res;
    }
}
