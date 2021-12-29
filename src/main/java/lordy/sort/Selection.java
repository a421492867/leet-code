package lordy.sort;

public class Selection {

    public static void sort(Comparable[] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j].compareTo(nums[min]) < 0){
                    min = j;
                }
            }
            Comparable temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {2,0,1};
        sort(nums);
        for(int s : nums){
            System.out.println(s);
        }
    }
}
