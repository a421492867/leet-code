package lordy.exercise;

public class Leetcode283 {

    public void moveZeros(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                int k = i;
                while(k < n && nums[k] == 0){
                    k++;
                }
                if(k < n){
                    int x = nums[i];
                    nums[i] = nums[k];
                    nums[k] = x;
                }else {
                    break;
                }
            }
        }
    }
}
