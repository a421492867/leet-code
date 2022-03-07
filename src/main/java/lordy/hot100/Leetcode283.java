package lordy.hot100;

public class Leetcode283 {

    public void moveZeroes(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int k = i;
                while (k < n && nums[k] == 0){
                    k++;
                }
                if(k < n){
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }else {
                    break;
                }
            }
        }
    }
}
