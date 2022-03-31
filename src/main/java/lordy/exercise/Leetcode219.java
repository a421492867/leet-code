package lordy.exercise;

public class Leetcode219 {

    public boolean containsNearbyDuplicate(int[] nums, int k){
        int n = nums.length;
        int l = 0;
        while (l < n){
            //int ll = l - k < 0 ? 0 : l - k;
            int lr = l + k > n - 1 ? n - 1 : l + k;
//            while(ll < l){
//                if(nums[ll] == nums[l]){
//                    return true;
//                }
//                ll++;
//            }
            while(lr > l){
                if(nums[lr] == nums[l]){
                    return true;
                }
                lr--;
            }
            l++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        Leetcode219 l = new Leetcode219();
        System.out.println(l.containsNearbyDuplicate(nums, k));
    }
}
