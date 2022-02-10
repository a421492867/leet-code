package lordy.bitoperation;

/**
 * No.461
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y){
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
