package lordy.sort;

public class QuickSort {

    public static void sort(int[] a){
        int n = a.length;
        sort(a, 0, n - 1);
    }

    public static void sort(int[] a, int low, int high){
        if(high <= low) return;
        int j = partition(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    public static int partition(int[] a, int low, int high){
        int i = low, j = high + 1;
        int v = a[low];
        while (true){
            while (a[++i] < v) if(i == high) break;
            while (a[--j] > v) if(j == low) break;
            if(i >= j) break;
            exch(a, i, j);
        }
        exch(a, low, j);
        return j;
    }

    public static void exch(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        sort(nums);
        for(int s : nums){
            System.out.println(s);
        }
    }
}
