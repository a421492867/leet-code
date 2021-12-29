package lordy.sort;

public class Insertion {

    public static void sort(Comparable nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            for(int j = i; j > 0; j--){
                if(nums[j].compareTo(nums[j - 1]) < 0){
                    Comparable temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {2,5,8,3,5,0,7,19,4};
        sort(nums);
        for(int s : nums){
            System.out.println(s);
        }
    }
}
