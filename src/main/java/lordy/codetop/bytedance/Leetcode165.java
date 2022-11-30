package lordy.codetop.bytedance;

public class Leetcode165 {

    public int compareVersion(String version1, String version2){
        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");
        int m = array1.length, n = array2.length;
        int k = 0;
        while (k < m || k < n){
            String str1 = k >= m ? "0" : array1[k];
            String str2 = k >= n ? "0" : array2[k];
            int res = compare(str1, str2);
            if(res > 0){
                return 1;
            }else if(res < 0){
                return -1;
            }else {
                k++;
            }
        }
        return 0;
    }

    private int compare(String str1, String str2){
        StringBuilder sb1 = new StringBuilder();
        boolean str1Flag = true;
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == '0' && str1Flag){
                continue;
            }else{
                str1Flag = false;
                sb1.append(str1.charAt(i));
            }
        }

        StringBuilder sb2 = new StringBuilder();
        boolean str2Flag = true;
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) == '0' && str2Flag){
                continue;
            }else {
                str2Flag = false;
                sb2.append(str2.charAt(i));
            }
        }
        str1 = sb1.toString();
        str2 = sb2.toString();
        Integer str1Int = "".equals(str1) ? 0 : Integer.parseInt(str1);
        Integer str2Int = "".equals(str2) ? 0 : Integer.parseInt(str2);
        return str1Int.compareTo(str2Int);
    }

    public static void main(String[] args) {
        Leetcode165 l = new Leetcode165();
        System.out.println(l.compareVersion("1.2", "1.10"));
    }
}
