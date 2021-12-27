package lordy.pointers.exercise;

/**
 * No.633
 */
public class SumOfSquareNumbers {

    public static boolean judgeSquareSum(int c){
        long temp = (long) Math.sqrt(c) + 1;    //long类型  否则无法通过 2147483600
        long i = 0, j = temp;
        while (i <= temp && j >=0){
            if(i * i + j * j < c){
                i++;
            }else if (i * i + j * j > c){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 2147483600;
        System.out.println(judgeSquareSum(c));
    }
}
