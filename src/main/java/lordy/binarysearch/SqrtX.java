package lordy.binarysearch;

/**
 * No.69
 */
public class SqrtX {

    public static int mySqrt(int x){
        if(x == 0){
            return x;
        }
        long l = 1, r = x, mid, sqrt;
        while (l <= r){
            mid = (l + r) / 2;
            sqrt = x / mid;
            if(sqrt == mid){
                return (int)sqrt;
            }else if(sqrt < mid){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return (int)r;  //结果之保留整数部分 小数部分被舍去  相当于向下取整  所以返回r
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
