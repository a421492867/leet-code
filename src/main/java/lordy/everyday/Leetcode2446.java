package lordy.everyday;

public class Leetcode2446 {

    public boolean haveConflict(String[] event1, String[] event2){
        return !(event1[1].compareTo(event2[0]) < 0 || event1[0].compareTo(event2[1]) > 0);
    }

}
