package lordy.codetop.jd;

public class Offer21 {

    public int[] exchange(int[] nums){

        int l = 0, r = nums.length - 1;

        while (l < r){
            while (l < r && nums[l] % 2 == 1){
                l++;
            }
            while (l < r && nums[r] % 2 == 0){
                r--;
            }

            if(l < r){
                int x = nums[l];
                nums[l] = nums[r];
                nums[r] = x;
                l++;
                r--;
            }
        }
        return nums;



    }
}
