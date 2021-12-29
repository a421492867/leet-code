package lordy.sort;

public class Shell {

    public static void sort(Comparable nums[]){
        int n = nums.length;
        int h = 1;
        while (h < n / 3){
            h = h * 3 + 1;
        }
        while (h >= 1){
            for(int i = h; i < n; i++){
                for(int j = i; j >= h; j -= h){
                    if(nums[j].compareTo(nums[j - h]) < 0){
                        Comparable temp = nums[j];
                        nums[j] = nums[j - h];
                        nums[j - h] = temp;
                    }
                }
            }
            h = h / 3;
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
