package lordy.exercise;

import java.util.Random;

public class Leetcode384 {

    int[] nums;
    int n;
    Random random = new Random();

    public Leetcode384(int[] nums) {
        this.nums = nums;
        this.n = nums.length;
    }

    public int[] reset(){
        return nums;
    }

    public int[] shuffle(){
        int[] ans = nums.clone();
        for(int i = 0; i < n; i++){
            swap(ans, i, i + random.nextInt(n - i));
        }
        return ans;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
