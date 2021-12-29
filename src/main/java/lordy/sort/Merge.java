package lordy.sort;

public class Merge {

    private static Comparable[] aux;

    public static void sort(Comparable[] nums){
        aux = new Comparable[nums.length];
        sort(nums, 0, nums.length - 1);
    }

    public static void sort(Comparable[] nums, int l, int r){
        if(r <= l) return;
        int mid = l + (r - l) / 2;
        sort(nums, l, mid);
        sort(nums, mid + 1, r);
        m(nums, l, mid, r);
    }

    public static void m(Comparable[] nums, int l, int mid, int r){
        int i = l, j = mid + 1;
        for(int k = l; k <= r; k++){
            aux[k] = nums[k];
        }
        for(int k = l; k <= r; k++){
            if(i > mid){
                nums[k] = aux[j++];
            }else if(j > r){
                nums[k] = aux[i++];
            }else if(aux[j].compareTo(aux[i]) < 0){
                nums[k] = aux[j++];
            }else {
                nums[k] = aux[i++];
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
