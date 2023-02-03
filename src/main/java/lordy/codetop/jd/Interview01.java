package lordy.codetop.jd;

public class Interview01 {

    public String compressString(String s){
        int n = s.length();
        if(n == 0) return s;
        char[] array = s.toCharArray();
        char cur = array[0];
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; i++){
            if(array[i] == cur){
                count++;
            }else{
                sb.append(cur).append(count);
                cur = array[i];
                count = 1;
            }
        }
        sb.append(cur).append(count);
        return sb.length() >= n ? s : sb.toString();
    }
}
