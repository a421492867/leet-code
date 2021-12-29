package lordy.sort.exercise;

/**
 * No.75
 */
public class SortColors {

    public static void sortColor(int[] nums){
        int length = nums.length;
        for(int i = 0; i < length; i++){
            int min = i;
            for(int j = i + 1; j < length; j++){
                if(nums[min] > nums[j]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColor(nums);
        for(int s : nums){
            System.out.println(s);
        }
    }
}
